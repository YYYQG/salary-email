package com.xxx.salaryemail.service.Impl;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.xxx.salaryemail.bo.ExplainBO;
import com.xxx.salaryemail.bo.SalaryBO;
import com.xxx.salaryemail.bo.SocialSecurityProvidentFundBO;
import com.xxx.salaryemail.dao.entity.EmailInformation;
import com.xxx.salaryemail.dao.entity.Staff;
import com.xxx.salaryemail.dao.repository.EmailInformationRepository;
import com.xxx.salaryemail.dao.repository.StaffRepository;
import com.xxx.salaryemail.service.ExcelService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ExcelServiceImpl implements ExcelService {


    @Autowired
    private EmailInformationRepository emailInformationRepository;

    @Autowired
    private StaffRepository staffRepository;

    public void excelImport(MultipartFile file) {

        List<SalaryBO> salaryBOs = getSalaryFromExcel(file);
        List<ExplainBO> explainBOs = getExplainFromExcel(file);
        /*List<SocialSecurityProvidentFundBO> socialSecurityProvidentFundBOs = getSocialSecurityProvidentFundFromExcel(file);

        Map<String,SocialSecurityProvidentFundBO> socialSecurityProvidentFundBOMap
                = socialSecurityProvidentFundBOs.stream()
                .filter(socialSecurityProvidentFundBO -> socialSecurityProvidentFundBO.getName()!=null)
                .collect(Collectors.toMap(SocialSecurityProvidentFundBO::getName,(socialSecurityProvidentFundBO)->socialSecurityProvidentFundBO));*/

        List<Staff> staffs = explainBOs.stream()
                .filter((explainBO)-> explainBO.getName()!=null)
                .map((explainBO) -> {
                    Staff staff = new Staff();
                    BeanUtils.copyProperties(explainBO, staff);
                    return staff;
                })
                .collect(Collectors.toList());
        staffs = batchUpdateOrSaveStaffs(staffs);

        Map<String, Staff> staffMap = staffs.stream()
                .collect(Collectors.toMap(Staff::getName, staff -> staff));

        List<EmailInformation> emailInformations = salaryBOs.stream()
                .map(salaryBO -> {
                    EmailInformation emailInformation = new EmailInformation();
                    Staff staff = staffMap.get(salaryBO.getName());
                    if(!ObjectUtils.isEmpty(staff)){
                        emailInformation.setStaffId(staff.getId());
                        emailInformation = fillEmailInformation(emailInformation, salaryBO);
                        return emailInformation;
                    }
                    return null;
                })
                .filter((emailInformation -> !ObjectUtils.isEmpty(emailInformation)))
                .collect(Collectors.toList());
        emailInformationRepository.deleteAll();
        emailInformationRepository.saveAll(emailInformations);
    }

    private List<Staff> batchUpdateOrSaveStaffs(List<Staff> staffs){

        List<String> staffIdCards = staffs.stream()
                .map(Staff::getIdCard)
                .collect(Collectors.toList());
        List<Staff> staffsInDB = staffRepository.findAllByIdCardIn(staffIdCards);
        Map<String, Staff> staffMap = staffsInDB.stream()
                .collect(Collectors.toMap(Staff::getIdCard, staff -> staff));
        staffs = staffs.stream()
                .filter(distinctByKey(Staff::getIdCard))
                .collect(Collectors.toList());
        for (Staff staff : staffs) {
            Staff staffInDB = staffMap.get(staff.getIdCard());
            if(!ObjectUtils.isEmpty(staffInDB)){
                staff.setId(staffInDB.getId());
                staff.setEmail(staffInDB.getEmail());
                staffRepository.update(staff);
            }else {
                staffRepository.insert(staff);
            }
        }
        return staffs;

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


    private EmailInformation fillEmailInformation(EmailInformation emailInformation,SalaryBO salaryBO){
        emailInformation.setBaseSalary(transferNull(salaryBO.getBaseSalary()));
        emailInformation.setPostSalary(transferNull(salaryBO.getPostSalary()));
        emailInformation.setSenioritySalary(transferNull(salaryBO.getSenioritySalary()));
        emailInformation.setMealAllowance(transferNull(salaryBO.getMealAllowance()));
        emailInformation.setOtherDeduction(transferNull(salaryBO.getOtherDeduction()));
        //工资总额=应发小计
        emailInformation.setTotalSalary(transferNull(salaryBO.getSendSubtotal()));
        //应扣所得税=应补税额
        emailInformation.setIndividualIncomeTax(transferNull(salaryBO.getFillTax()));
        emailInformation.setPerformanceAndBonus(transferNull(salaryBO.getPerformanceAndBonus()));
        emailInformation.setTakeHomeSalary(transferNull(salaryBO.getTakeHomeSalary()));
        emailInformation.setIndividualSocialSecurity(transferNull(salaryBO.getSocialFundSubtotal().subtract(salaryBO.getProvidentFund())));
        emailInformation.setIndividualProvidentFund(transferNull(salaryBO.getProvidentFund()));
        return emailInformation;

    }

    public BigDecimal transferNull(BigDecimal value){

        if(value==null){
            return BigDecimal.ZERO;
        }else {
            return value;
        }

    }

    private List<SalaryBO> getSalaryFromExcel(MultipartFile file) {

        List<SalaryBO> salaryBOs = new ArrayList<>();
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        params.setSheetNum(1);
        params.setStartSheetIndex(2);
        params.setLastOfInvalidRow(4);
        log.info("fileName:{}", file.getOriginalFilename());
        try {
            salaryBOs = ExcelImportUtil.importExcel(file.getInputStream(), SalaryBO.class, params);
        } catch (Exception e) {
            log.error("file upload error!");
            throw new RuntimeException("file upload error!");
        }
        return salaryBOs;

    }

    private List<ExplainBO> getExplainFromExcel(MultipartFile file) {

        List<ExplainBO> explainBOs = new ArrayList<>();
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        params.setSheetNum(1);
        params.setStartSheetIndex(4);
        log.info("fileName:{}", file.getOriginalFilename());
        try {
            explainBOs = ExcelImportUtil.importExcel(file.getInputStream(), ExplainBO.class, params);
        } catch (Exception e) {
            log.error("file upload error!");
            throw new RuntimeException("file upload error!");
        }
        return explainBOs;

    }


    private List<SocialSecurityProvidentFundBO> getSocialSecurityProvidentFundFromExcel(MultipartFile file) {

        List<SocialSecurityProvidentFundBO> socialSecurityProvidentFundBOs = new ArrayList<>();
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        params.setSheetNum(1);
        params.setStartSheetIndex(3);
        params.setLastOfInvalidRow(1);
        log.info("fileName:{}", file.getOriginalFilename());
        try {
            socialSecurityProvidentFundBOs = ExcelImportUtil.importExcel(file.getInputStream(), SocialSecurityProvidentFundBO.class, params);
        } catch (Exception e) {
            log.error("file upload error!");
            throw new RuntimeException("file upload error!");
        }
        return socialSecurityProvidentFundBOs;

    }



}

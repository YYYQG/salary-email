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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        List<SocialSecurityProvidentFundBO> socialSecurityProvidentFundBOs = getSocialSecurityProvidentFundFromExcel(file);
        Map<String,SalaryBO> salaryBOMap = salaryBOs.stream()
                .filter((salaryBO)-> salaryBO.getName()!=null)
                .collect(Collectors.toMap(SalaryBO::getName,(salaryBO -> salaryBO)));
        Map<String,SocialSecurityProvidentFundBO> socialSecurityProvidentFundBOMap
                = socialSecurityProvidentFundBOs.stream()
                .filter(socialSecurityProvidentFundBO -> socialSecurityProvidentFundBO.getName()!=null)
                .collect(Collectors.toMap(SocialSecurityProvidentFundBO::getName,(socialSecurityProvidentFundBO)->socialSecurityProvidentFundBO));
        List<Staff> staffs = explainBOs.stream()
                .filter((explainBO)-> explainBO.getName()!=null)
                .map((explainBO) -> {
                    Staff staff = new Staff();
                    BeanUtils.copyProperties(explainBO, staff);
                    return staff;
                })
                .collect(Collectors.toList());
        staffs = batchUpdateOrSaveStaffs(staffs);
        List<EmailInformation> emailInformationList = staffs.stream()
                .map((staff) -> {
                    EmailInformation emailInformation = new EmailInformation();
                    emailInformation.setStaffId(staff.getId());
                    SalaryBO salaryBO = salaryBOMap.get(staff.getName());
                    if(!ObjectUtils.isEmpty(salaryBO)){
                        emailInformation = fillEmailInformation(emailInformation,salaryBO);
                    }
                    SocialSecurityProvidentFundBO socialSecurityProvidentFundBO = socialSecurityProvidentFundBOMap.get(staff.getName());
                    if(!ObjectUtils.isEmpty(socialSecurityProvidentFundBO)){
                        emailInformation = fillEmailInformation(emailInformation,socialSecurityProvidentFundBO);
                    }
                    return emailInformation;
                })
                .collect(Collectors.toList());

        emailInformationRepository.saveAll(emailInformationList);
    }

    private List<Staff> batchUpdateOrSaveStaffs(List<Staff> staffs){

        List<String> staffIdCards = staffs.stream()
                .map(Staff::getIdCard)
                .collect(Collectors.toList());
        List<Staff> staffsInDB = staffRepository.findAllByIdCardIn(staffIdCards);
        Map<String, Staff> staffMap = staffsInDB.stream()
                .collect(Collectors.toMap(Staff::getIdCard, staff -> staff));
        for (Staff staff : staffs) {
            Staff staffInDB = staffMap.get(staff.getIdCard());
            if(!ObjectUtils.isEmpty(staffInDB)){
                staff.setId(staffInDB.getId());
                staffRepository.update(staff);
            }else {
                staffRepository.insert(staff);
            }
        }
        return staffs;

    }

    private EmailInformation fillEmailInformation(EmailInformation emailInformation,SalaryBO salaryBO){

        emailInformation.setBaseSalary(salaryBO.getBaseSalary());
        emailInformation.setPostSalary(salaryBO.getPostSalary());
        emailInformation.setSenioritySalary(salaryBO.getSenioritySalary());
        emailInformation.setMealAllowance(salaryBO.getMealAllowance());
        emailInformation.setOtherDeduction(salaryBO.getOtherDeduction());
        //工资总额=应发小计
        emailInformation.setTotalSalary(salaryBO.getSendSubtotal());
        //应扣所得税=应补税额
        emailInformation.setIndividualIncomeTax(salaryBO.getFillTax());
        emailInformation.setTakeHomeSalary(salaryBO.getTakeHomeSalary());
        return emailInformation;

    }

    private EmailInformation fillEmailInformation(EmailInformation emailInformation,SocialSecurityProvidentFundBO socialSecurityProvidentFundBO){

        emailInformation.setIndividualSocialSecurity(socialSecurityProvidentFundBO.getIndividualSocialSecurity());
        emailInformation.setIndividualProvidentFund(socialSecurityProvidentFundBO.getIndividualProvidentFund());
        return emailInformation;
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

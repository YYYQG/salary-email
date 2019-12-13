package com.xxx.salary_email.service;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.xxx.salary_email.bo.ExplainBO;
import com.xxx.salary_email.bo.SalaryBO;
import com.xxx.salary_email.bo.SocialSecurityProvidentFundBO;
import com.xxx.salary_email.dao.entity.EmailInformation;
import com.xxx.salary_email.dao.entity.Salary;
import com.xxx.salary_email.dao.entity.Staff;
import com.xxx.salary_email.dao.repository.SalaryRepository;
import com.xxx.salary_email.dao.repository.StaffRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ExcelService {



    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private StaffRepository staffRepository;

    public boolean excelImport(MultipartFile file) {

        List<SalaryBO> salaryBOs = getSalaryFromExcel(file);
        List<ExplainBO> explainBOs = getExplainFromExcel(file);
        List<SocialSecurityProvidentFundBO> socialSecurityProvidentFundBOs = getSocialSecurityProvidentFundFromExcel(file);
        List<Staff> staffs = explainBOs.stream()
                .map((explainBO) -> {
                    Staff staff = new Staff();
                    BeanUtils.copyProperties(explainBO, staff);
                    return staff;
                })
                .collect(Collectors.toList());
        staffRepository.saveAll(staffs);




        return true;

    }

    public List<SalaryBO> getSalaryFromExcel(MultipartFile file) {

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

    public List<ExplainBO> getExplainFromExcel(MultipartFile file) {

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


    public List<SocialSecurityProvidentFundBO> getSocialSecurityProvidentFundFromExcel(MultipartFile file) {

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


    public List<Salary> getImportInfo(Integer batchId) {


        return null;

    }


}

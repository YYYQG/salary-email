package com.xxx.salary_email.service;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.xxx.salary_email.bo.SalaryBO;
import com.xxx.salary_email.dao.entity.Salary;
import com.xxx.salary_email.dao.repository.SalaryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ExcelService {


    @Autowired
    private SalaryRepository salaryRepository;

    public List<Salary> excelImport(MultipartFile file){

        List<SalaryBO> salaries = null;
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        params.setSheetNum(1);
        params.setStartSheetIndex(2);
        params.setLastOfInvalidRow(4);
        log.info("fileName:{}",file.getOriginalFilename());
        try {
            salaries = ExcelImportUtil.importExcel(file.getInputStream(), SalaryBO.class,params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Salary> salaryList = new ArrayList<>();
        salaries.stream().forEach(salary -> {
            salaryList.add(salaryBoToSalary(salary));
        });
        salaryRepository.saveAll(salaryList);
        return salaryList;

    }

    public Salary salaryBoToSalary(SalaryBO salary){

        return new Salary(salary.getId(),salary.getDepartment(),salary.getName(),salary.getPayScale(),salary.getBasePay(),salary.getPostWage(),salary.getSeniorityPay(),salary.getMealAllowance(),salary.getOther(),salary.getSendSubtotal(),salary.getAnnuity(),salary.getMedicare(),salary.getUnemploymentInsurance(),salary.getAccumulationFund(),salary.getSocialFundSubtotal(),salary.getFillTax(),salary.getActualQuantity());

    }

    public List<Salary> getImportInfo(Integer batchId){


        return null;

    }



}

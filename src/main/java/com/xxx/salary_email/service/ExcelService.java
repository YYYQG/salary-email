package com.xxx.salary_email.service;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.xxx.salary_email.bo.Salary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ExcelService {

    public List excelImport(MultipartFile file){

        List<Salary> salaries = null;
        ImportParams params = new ImportParams();
        params.setTitleRows(1);

        try {
            salaries = ExcelImportUtil.importExcel(file.getInputStream(),Salary.class,params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salaries;

    }

}

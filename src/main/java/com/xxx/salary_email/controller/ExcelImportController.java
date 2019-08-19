package com.xxx.salary_email.controller;

import com.xxx.salary_email.bo.Salary;
import com.xxx.salary_email.service.ExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/excel")
public class ExcelImportController {

    @Autowired
    private ExcelService excelService;

    @PostMapping(value = "/import",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String importExcel(MultipartFile file){

        List<Salary> salaries =  excelService.excelImport(file);
        log.info("excel内容：",salaries.toString());
        return salaries.toString();


    }

}

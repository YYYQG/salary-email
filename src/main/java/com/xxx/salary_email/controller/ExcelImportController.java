package com.xxx.salary_email.controller;

import com.xxx.salary_email.service.ExcelService;
import com.xxx.salary_email.util.ResponseEntity;
import com.xxx.salary_email.util.ResponseHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping(value = "/excel")
public class ExcelImportController {

    @Autowired
    private ExcelService excelService;

    @PostMapping(value = "/import",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity importExcel(MultipartFile file){
        excelService.excelImport(file);
        return ResponseHelper.ofNothing();
    }





}

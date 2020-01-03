package com.xxx.salaryemail.controller;

import com.xxx.salaryemail.service.ExcelService;
import com.xxx.salaryemail.util.ResponseEntity;
import com.xxx.salaryemail.util.ResponseHelper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping(value = "/api/excel")
public class ExcelImportController {

    @Autowired
    private ExcelService excelService;

    @ApiOperation("import excel")
    @PostMapping(value = "/import",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity importExcel(@RequestParam(name = "file") MultipartFile file){
        excelService.excelImport(file);
        return ResponseHelper.ofNothing();
    }





}

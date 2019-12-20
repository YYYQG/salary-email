package com.xxx.salary_email.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 17:50
 */
public interface ExcelService {

    void excelImport(MultipartFile file);
}

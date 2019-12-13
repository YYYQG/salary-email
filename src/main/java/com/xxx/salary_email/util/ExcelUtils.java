package com.xxx.salary_email.util;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class ExcelUtils {

    public static <T> List<T> importExcel(MultipartFile file, Integer titleRows, Integer headRows, Class<T> bo) {

        List<T> list = null;
        try {
            if (ObjectUtils.isEmpty(file)) {
                return null;
            }
            ImportParams params = new ImportParams();
            params.setTitleRows(titleRows);
            params.setHeadRows(headRows);

            list = ExcelImportUtil.importExcel(file.getInputStream(), bo, params);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static <T> List<T> importExcel(MultipartFile file, Integer titleRows, Integer headRows,Integer lastOfInvalidRow, Class<T> bo) {

        List<T> list = null;
        try {
            if (ObjectUtils.isEmpty(file)) {
                return null;
            }
            ImportParams params = new ImportParams();
            params.setTitleRows(titleRows);
            params.setHeadRows(headRows);
            params.setLastOfInvalidRow(lastOfInvalidRow);
            list = ExcelImportUtil.importExcel(file.getInputStream(), bo, params);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}

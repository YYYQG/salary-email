package com.xxx.salaryemail.util;

import org.springframework.http.HttpStatus;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 17:38
 */
public class ResponseHelper {

    public static <T> com.xxx.salaryemail.util.ResponseEntity of(T data){
        return com.xxx.salaryemail.util.ResponseEntity.builder()
                .status(HttpStatus.OK.value())
                .data(data)
                .build();
    }

    public static <T> com.xxx.salaryemail.util.ResponseEntity ofNothing(){
        return com.xxx.salaryemail.util.ResponseEntity.builder().build();
    }

}

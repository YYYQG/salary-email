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

    public static <T> ResponseEntity of(T data){
        return ResponseEntity.builder()
                .status(HttpStatus.OK.value())
                .data(data)
                .build();
    }

    public static <T> ResponseEntity ofNothing(){
        return ResponseEntity.builder().build();
    }

}

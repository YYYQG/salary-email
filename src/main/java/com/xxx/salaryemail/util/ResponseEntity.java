package com.xxx.salaryemail.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 17:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseEntity <T> {

    private Integer status;

    private String message;

    private T data;

}

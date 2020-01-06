package com.xxx.salaryemail.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 01/06/20 10:50
 */

@ApiModel
@Data
public class StaffVO {

    @ApiModelProperty(value = "email",required = true,example = "2529719324@qq.com")
    private String email;

}

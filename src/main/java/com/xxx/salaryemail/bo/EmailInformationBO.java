package com.xxx.salaryemail.bo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 01/03/20 14:08
 */
@Data
public class EmailInformationBO {


    private Integer staffId;

    private String staffName;

    //基本工资
    private BigDecimal baseSalary;

    //岗位工资
    private BigDecimal postSalary;

    //工龄工资
    private BigDecimal senioritySalary;

    //绩效、奖金
    private BigDecimal performanceAndBonus;

    //餐费补贴
    private BigDecimal mealAllowance;

    //其它扣除
    private BigDecimal otherDeduction;

    //工资总额
    private BigDecimal totalSalary;

    //社保个人
    private BigDecimal individualSocialSecurity;

    //公积金个人
    private BigDecimal individualProvidentFund;

    //应扣所得税
    private BigDecimal individualIncomeTax;

    //实际应付工资
    private BigDecimal takeHomeSalary;

    private String email;

}

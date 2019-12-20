package com.xxx.salary_email.bo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.math.BigDecimal;


@ExcelTarget(value = "工资明细")
@Data
public class SalaryBO {

    @Excel(name = "部门")
    private String department;

    @Excel(name = "姓　名")
    private String name;

    @Excel(name = "工资标准")
    private BigDecimal payScale;

    @Excel(name = "基本工资")
    private BigDecimal baseSalary;

    @Excel(name = "岗位工资")
    private BigDecimal postSalary;

    @Excel(name = "工龄工资")
    private BigDecimal senioritySalary;

    @Excel(name = "餐补")
    private BigDecimal mealAllowance;

    //其它扣除
    @Excel(name = "其他")
    private BigDecimal otherDeduction;

    @Excel(name = "应发小计")
    private BigDecimal sendSubtotal;

    @Excel(name = "养老")
    private BigDecimal annuity;

    @Excel(name = "医疗")
    private BigDecimal medicare;

    @Excel(name = "失业")
    private BigDecimal  unemploymentInsurance;

    @Excel(name = "公积金")
    private BigDecimal providentFund;

    @Excel(name = "社保公积金小计")
    private BigDecimal socialFundSubtotal;

    @Excel(name = "应补税额")
    private BigDecimal fillTax;

    @Excel(name = "实发数")
    private BigDecimal takeHomeSalary;

}

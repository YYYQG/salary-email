package com.xxx.salary_email.bo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@ExcelTarget("说明")
@Data
public class ExplainBO implements Serializable {

    @Excel(name = "序号")
    private int id;

    @Excel(name = "部门")
    private String department;

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "性别")
    private String sex;

    @Excel(name = "身份证号码")
    private String idCard;

    @Excel(name = "学历（如本/专科）")
    private String education;

    @Excel(name = "开户银行")
    private String depositBank;

    @Excel(name = "银行账号")
    private String bankAccount;

    @Excel(name = "入职日期")
    private LocalDate entryData;

    @Excel(name = "电话号码")
    private String telephone;

    @Excel(name = "工资")
    private int salary;

    @Excel(name = "备注")
    private String remark;

}

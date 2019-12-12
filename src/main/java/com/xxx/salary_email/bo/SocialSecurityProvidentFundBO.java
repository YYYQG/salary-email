package com.xxx.salary_email.bo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/12/19 17:00
 */
@ExcelTarget(value = "社保公积金明细")
@Data
public class SocialSecurityProvidentFundBO {

    @Excel(name = "序号")
    private int id;

    @Excel(name = "姓　名")
    private String name;

    @Excel(name = "部门")
    private String department;

    @Excel(name = "人员类别")
    private String personnelCategory;

    @Excel(name = "计算基数1")
    private Integer calculationBase1;

    @Excel(name = "计算基数2")
    private Integer calculationBase2;

    @Excel(name = "养老单位比例")
    private String companyPensionRatio;

    @Excel(name = "养老单位")
    private Integer companyPension;

    @Excel(name = "个人单位比例")
    private String individualPensionRatio;

    @Excel(name = "养老个人")
    private Integer individualPension;

}

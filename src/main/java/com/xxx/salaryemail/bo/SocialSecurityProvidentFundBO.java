package com.xxx.salaryemail.bo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/12/19 17:00
 */
@ExcelTarget("社保公积金明细")
@Data
public class SocialSecurityProvidentFundBO {

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "部门")
    private String department;

    @Excel(name = "人员类别")
    private String personnelCategory;

    @Excel(name = "计算基数1")
    private BigDecimal calculationBase1;

    @Excel(name = "计算基数2")
    private BigDecimal calculationBase2;

    @Excel(name = "养老单位比例")
    private String companyPensionRatio;

    @Excel(name = "养老单位")
    private BigDecimal companyPension;

    @Excel(name = "养老个人比例")
    private String individualPensionRatio;

    @Excel(name = "养老个人")
    private BigDecimal individualPension;

    @Excel(name = "医疗单位比例")
    private String companyMedicalRatio;

    @Excel(name = "医疗单位")
    private BigDecimal companyMedical;

    @Excel(name = "医疗个人比例")
    private String individualMedicalRatio;

    @Excel(name = "医疗个人")
    private BigDecimal individualMedical;

    @Excel(name = "失业单位比例")
    private String companyUnemploymentRatio;

    @Excel(name = "失业单位")
    private BigDecimal companyUnemployment;

    @Excel(name = "失业个人比例")
    private String individualUnemploymentRatio;

    @Excel(name = "失业个人")
    private BigDecimal individualUnemployment;

    @Excel(name = "工伤单位比例")
    private String companyInjuryRatio;

    @Excel(name = "工伤单位")
    private BigDecimal companyInjury;

    @Excel(name = "生育单位比例")
    private String individualInjuryRatio;

    @Excel(name = "生育单位")
    private BigDecimal individualInjury;

    @Excel(name = "单位比例")
    private String  companyRatio;

    @Excel(name = "大病单位")
    private BigDecimal companyIllness;

    @Excel(name = "社保单位")
    private BigDecimal companySocialSecurity;

    @Excel(name = "社保个人")
    private BigDecimal individualSocialSecurity;

    @Excel(name = "社保合计")
    private BigDecimal totalSocialSecurity;

    @Excel(name = "公积金基数")
    private BigDecimal providentFundBase;

    @Excel(name = "公积金单位")
    private BigDecimal companyProvidentFund;

    @Excel(name = "公积金个人")
    private BigDecimal individualProvidentFund;

    @Excel(name = "公积金合计")
    private BigDecimal totalProvidentFund;

    @Excel(name = "备注")
    private String remark;

}

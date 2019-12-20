package com.xxx.salary_email.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/13/19 17:51
 */
@Entity
@Table(name = "email_information")
@DynamicInsert
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailInformation {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "staff_id")
    private Integer staffId;

    @Column(name = "date_of_salary")
    private LocalDateTime dateOfSalary;

    //基本工资
    @Column(name = "base_salary")
    private BigDecimal baseSalary;

    //岗位工资
    @Column(name = "post_salary")
    private BigDecimal postSalary;

    //工龄工资
    @Column(name = "seniority_salary")
    private BigDecimal senioritySalary;

    //绩效、奖金
    @Column(name = "performance_and_bonus")
    private BigDecimal performanceAndBonus;

    //餐费补贴
    @Column(name = "meal_allowance")
    private BigDecimal mealAllowance;

    //其它扣除
    @Column(name = "other_deduction")
    private BigDecimal otherDeduction;

    //工资总额
    @Column(name = "total_salary")
    private BigDecimal totalSalary;

    //社保个人
    @Column(name = "individual_social_security")
    private BigDecimal individualSocialSecurity;

    //公积金个人
    @Column(name = "individual_provident_fund")
    private BigDecimal individualProvidentFund;

    //应扣所得税
    @Column(name = " individual_income_tax")
    private BigDecimal individualIncomeTax;

    //实际应付工资
    @Column(name = "take_home_salary")
    private BigDecimal takeHomeSalary;


}

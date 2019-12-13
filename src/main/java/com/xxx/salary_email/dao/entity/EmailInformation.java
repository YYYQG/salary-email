package com.xxx.salary_email.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

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
    private int id;

    @Column(name = "staff_id")
    private Integer staffId;

    @Column(name = "date_of_salary")
    private Date dateOfSalary;

    @Column(name = "base_salary")
    private BigDecimal baseSalary;

    @Column(name = "post_salary")
    private BigDecimal postSalary;

    @Column(name = "seniority_salary")
    private BigDecimal senioritySalary;

    @Column(name = "performance_and_bonus")
    private Integer performanceAndBonus;

    @Column(name = "meal_allowance")
    private Integer mealAllowance;

    @Column(name = "other_deduction")
    private Integer otherDeduction;

    @Column(name = "total_salary")
    private BigDecimal totalSalary;

    @Column(name = "individual_social_security")
    private Integer individualSocialSecurity;

    @Column(name = "individual_provident_fund")
    private Integer individualProvidentFund;

    @Column(name = "take_home_salary")
    private BigDecimal takeHomeSalary;

    @Column(name = " individual_income_tax")
    private Integer individualIncomeTax;


}

package com.xxx.salaryemail.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "salary")
@Entity
@DynamicInsert
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary {

    @Id
    private Integer id;

    private String department;

    private String name;

    private double payScale;

    private double basePay;

    private double postWage;

    private double seniorityPay;

    private double mealAllowance;

    private double other;

    private double sendSubtotal;

    private double annuity;

    private double medicare;

    private double  unemploymentInsurance;

    private double accumulationFund;

    private double socialFundSubtotal;

    private double fillTax;

    private double actualQuantity;

}

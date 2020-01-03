package com.xxx.salaryemail.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@DynamicInsert
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_card")
    private String idCard;


    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "sex")
    private String sex;

    @Column(name = "education")
    private String education;

    @Column(name = "deposit_bank")
    private String depositBank;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "entry_date")
    private LocalDateTime entryDate;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "remark")
    private String remark;

    @Column(name = "email")
    private String email;

    @Column(name = "update_datetime")
    private LocalDateTime updateDatetime;

}

package com.xxx.salary_email.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
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
@DynamicInsert
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "sex")
    private String sex;

    @Column(name = "id_card")
    private String idCard;

    @Column(name = "education")
    private String education;

    @Column(name = "deposit_bank")
    private String depositBank;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "entry_data")
    private Timestamp entryData;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "remark")
    private String remark;

    @Column(name = "update_date")
    private Timestamp updateDate;

}

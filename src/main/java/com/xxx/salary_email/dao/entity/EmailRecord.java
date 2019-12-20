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
@Table(name = "email_record")
@DynamicInsert
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRecord {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "staff_id")
    private Integer staffId;

    @Column(name = "transmit_time")
    private LocalDateTime transmitTime;

    @Column(name = "date_of_salary")
    private Date dateOfSalary;

}

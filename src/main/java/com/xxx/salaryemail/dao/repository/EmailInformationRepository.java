package com.xxx.salaryemail.dao.repository;

import com.xxx.salaryemail.bo.EmailInformationBO;
import com.xxx.salaryemail.dao.entity.EmailInformation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/20/19 11:29
 */
public interface EmailInformationRepository extends JpaRepository<EmailInformation,Integer> {

    @EntityGraph(value = "EmailInformation.staff")
    List<EmailInformation> findAll();

    @Transactional
    @Modifying
    @Query("update EmailInformation set baseSalary = :#{#email.baseSalary},postSalary = :#{#email.postSalary}," +
            "senioritySalary = :#{#email.senioritySalary}, performanceAndBonus = :#{#email.performanceAndBonus}," +
            "mealAllowance = :#{#email.mealAllowance}, otherDeduction = :#{#email.otherDeduction}, totalSalary = :#{#email.totalSalary}," +
            "individualSocialSecurity = :#{#email.individualSocialSecurity}, individualProvidentFund = :#{#email.individualProvidentFund}," +
            "individualIncomeTax = :#{#email.individualIncomeTax}, takeHomeSalary = :#{#email.takeHomeSalary} where staffId = :#{#email.staffId}")
    void updateEmailInformation(@Param("email")EmailInformationBO email);

}

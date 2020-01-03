package com.xxx.salaryemail.dao.repository;

import com.xxx.salaryemail.dao.entity.EmailInformation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

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

}

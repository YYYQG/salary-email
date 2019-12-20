package com.xxx.salary_email.dao.repository;

import com.xxx.salary_email.dao.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author Abely
 * @date 12/13/19 18:07
 */
public interface StaffRepository extends JpaRepository<Staff,Integer>,StaffRepositoryCustom {

    List<Staff> findAllByIdCardIn(List<String> staffIdCards);

}

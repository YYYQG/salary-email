package com.xxx.salaryemail.dao.repository;

import com.xxx.salaryemail.dao.entity.Staff;
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
 * @date 12/13/19 18:07
 */
public interface StaffRepository extends JpaRepository<Staff,Integer>,StaffRepositoryCustom {

    List<Staff> findAllByIdCardIn(List<String> staffIdCards);

    @Modifying
    @Transactional
    @Query("update Staff set email = :email where id = :id")
    void updateStaffEmail(@Param("id") Integer id, @Param("email") String email);
}

package com.xxx.salaryemail.dao.repository;

import com.xxx.salaryemail.dao.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}

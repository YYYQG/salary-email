package com.xxx.salaryemail.dao.repository;

import com.xxx.salaryemail.dao.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {


}

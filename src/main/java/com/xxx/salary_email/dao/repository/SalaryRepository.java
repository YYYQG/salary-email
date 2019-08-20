package com.xxx.salary_email.dao.repository;

import com.xxx.salary_email.dao.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {


}

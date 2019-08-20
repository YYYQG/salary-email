package com.xxx.salary_email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SalaryEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaryEmailApplication.class, args);
    }

}

package com.emp_mgm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp_mgm.test.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
	
}
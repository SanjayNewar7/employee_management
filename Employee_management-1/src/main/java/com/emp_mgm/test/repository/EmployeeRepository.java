package com.emp_mgm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp_mgm.test.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
		
	}
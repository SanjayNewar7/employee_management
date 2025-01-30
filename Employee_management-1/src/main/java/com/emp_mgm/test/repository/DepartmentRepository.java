package com.emp_mgm.test.repository;

import com.emp_mgm.test.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

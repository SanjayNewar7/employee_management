package com.emp_mgm.test.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp_mgm.test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
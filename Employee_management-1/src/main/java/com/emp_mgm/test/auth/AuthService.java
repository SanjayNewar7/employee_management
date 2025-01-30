package com.emp_mgm.test.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.emp_mgm.test.repository.UserRepository;
import com.example.task.auth.LoginRequest;
import com.example.task.auth.RegisterRequest;
import com.test04.test.utils.JwtUtil;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public ResponseEntity<String> login(LoginRequest loginRequest) {
        // Authenticate user and generate JWT
    	return ResponseEntity.ok("Login successful!");
    }

    public ResponseEntity<String> register(RegisterRequest registerRequest) {
        // Register new user
    	return ResponseEntity.ok("User registered successfully!");
    }
}}

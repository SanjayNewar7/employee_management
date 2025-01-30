package com.emp_mgm.test.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.servlet.Filter;
import java.io.IOException;

@Component
public abstract class JwtFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Extract JWT token from the Authorization header, verify it and set the authentication context
        String token = request.getHeader("Authorization");

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7); // Extract token from "Bearer <Token>"
            // Perform token verification and set security context (you can use a JwtService class)
            // If valid, authenticate the user
        }

        filterChain.doFilter(request, response);
    }
}

package com.auth.Auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.Auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
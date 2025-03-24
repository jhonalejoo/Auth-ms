package com.auth.Auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.Auth.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
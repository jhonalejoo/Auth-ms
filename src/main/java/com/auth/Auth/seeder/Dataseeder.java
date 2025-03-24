package com.auth.Auth.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.auth.Auth.entities.User;
import com.auth.Auth.repositories.UserRepository;

@Component
class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataSeeder(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            for (int i = 1; i <= 10; i++) {
                User user = new User();
                user.setFullName ("User" + i);
                user.setUserName("user" + i + "@example.com");
                String rawPassword = "password" + i;
                user.setPassword(passwordEncoder.encode(rawPassword));
                userRepository.save(user);
            }
            System.out.println("10 usuarios creados con email y contraseña encriptada.");
        }
    }
}

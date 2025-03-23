package com.auth.Auth.service;

import org.springframework.stereotype.Service;
import com.auth.Auth.entity.User;
import com.auth.Auth.repository.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getUsers(){
        return (ArrayList<User>) userRepository.findAll();
    }

}

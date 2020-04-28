package com.demo.TestProjectJava.services.impl;

import com.demo.TestProjectJava.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import com.demo.TestProjectJava.repository.UserRepository;
import com.demo.TestProjectJava.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<Users> validateUser(Users user) {
        return userRepository.findById(user.getUsername());
    }
}

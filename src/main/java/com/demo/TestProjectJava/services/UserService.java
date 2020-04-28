package com.demo.TestProjectJava.services;

import com.demo.TestProjectJava.model.Users;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {
    public Optional<Users> validateUser(Users user);
}

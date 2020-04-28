package com.demo.TestProjectJava.controller;

import com.demo.TestProjectJava.model.Users;
import com.demo.TestProjectJava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public ResponseEntity fetchUser(@RequestBody Users user) {
        Optional<Users> isValidUser = userService.validateUser(user);
        if (isValidUser.isPresent()) {
            if (user.getUsername().equalsIgnoreCase(isValidUser.get().getUsername()) && user.getPassword().equalsIgnoreCase(isValidUser.get().getPassword())) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}

package com.LLD.BookMyShow.controllers;

import com.LLD.BookMyShow.dtos.CreateUserDTO;
import com.LLD.BookMyShow.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public User createUser(@RequestBody CreateUserDTO request) {
        System.out.println("Creating user!" + request.getEmail());
        return null;
    }
}

// Delegate calls to services classes
// 1. Validate requests
// 2. Data transformation DTO => Model

// Request comes to Tomcat 8080
// Spring has to map request to a method(done using annotations)

// Component Scanning - spring goes through all the classes and identifies which classes requires instances and creates SINGLETON instances(Beans)

// Create user - POST /user
// Update user - PUT /user
package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUser(){
        return "Hello, user!";
    }

    @GetMapping("/add")
    public String addUser(){
        return "User added!";
    }

    @GetMapping("/remove")
    public String removedUser(@RequestParam int id){
        return "User number " + id + " was removed";
    }
}

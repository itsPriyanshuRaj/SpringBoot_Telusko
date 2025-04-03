package com.priyanshuRaj.Spring.security.with.Gemini.controller;

import com.priyanshuRaj.Spring.security.with.Gemini.Services.UserService;
import com.priyanshuRaj.Spring.security.with.Gemini.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getALlUser(){
        return userService.getAllUser();
    }

    @GetMapping("/users/{username}")
    public User getUser(@PathVariable("username") String username){
        System.out.println("single user endpoint hit");
        return userService.getUserbyUsername(username);
    }

    @PostMapping("/user/addUser")
    public User addUser(@RequestBody User user){
        System.out.println("addUser endpoint hit");
        return userService.addUser(user);
    }

    @PostMapping("/randomAss")
    public User random(@RequestBody User username){
        System.out.println("random post method triggered");
        return userService.addUsername(username);
    }
 }

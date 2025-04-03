package com.priyanshuRaj.Spring.security.with.Gemini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Hello from spring security project";
    }

    @GetMapping("/login")
    public String login(){
        return "Login endpoint triggered";
    }
    @GetMapping("/register")
    public String register(){
        return "Register endpoint triggered";
    }

}

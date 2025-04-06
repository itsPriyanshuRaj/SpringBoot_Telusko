package com.priyanshuRaj.Spring.security.with.Gemini.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/signin")
    public String Signin(){
        logger.info("Signin endpoint called");
        System.out.println("Sigin endpoint hit successfull");
        return "login.html";
    }
}

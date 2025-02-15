package com.priyanshuraj.simpleWebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logincontroller {
    
    @RequestMapping("/login")
    public String auth(){
        return "Welcome to Login Page!!!";
    }

}

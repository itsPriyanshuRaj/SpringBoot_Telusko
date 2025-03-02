package com.priyanshuraj.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/")
    public String home(){
        return "Welcome to BoilerPlate project with Spring Boot!!!";
    }

    @GetMapping("/getTask")
    public String getTask(){
        return "";
    }
}

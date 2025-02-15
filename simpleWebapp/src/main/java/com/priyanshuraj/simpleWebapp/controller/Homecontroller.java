package com.priyanshuraj.simpleWebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @RequestMapping("/")

    public String greet(){
        return "Welcome to first spring boot project";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont do tha here";
    }
}

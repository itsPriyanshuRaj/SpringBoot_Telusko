package com.priyanshuRaj.Spring.security.with.Gemini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Hello from spring security project";
    }
}

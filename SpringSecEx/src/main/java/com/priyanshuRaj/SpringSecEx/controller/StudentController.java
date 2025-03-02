package com.priyanshuRaj.SpringSecEx.controller;


import java.util.ArrayList;
import java.util.List;

import com.priyanshuRaj.SpringSecEx.modal.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    

    private List<Student> students = new ArrayList<>(List.of(
        new Student(101,"raj",90),
        new Student(102,"priyanshu",89)
    ));

    @GetMapping("/students")
    private List<Student> getStudents(){
        return students;
    }

    @GetMapping("/csrf-toke")
    private CsrfToken csrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    private  Student addStudent(@RequestBody Student student){
         students.add(student);
         return student;
    }
    
}

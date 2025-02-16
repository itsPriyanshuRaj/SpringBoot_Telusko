package com.priyanshuRaj.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //  1. field injectiom
    @Autowired
    // @Qualifier("desktop")
    private Computer comp;

    //2.  constructor Injection
    // public Dev(Laptop laptop){
    //     this.laptop = laptop;
    // }

    // 3. setter injection

    // @Autowired
    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }
    public void build(){
        comp.compile();
        System.out.println("woorking on spring project");
    }
    
}

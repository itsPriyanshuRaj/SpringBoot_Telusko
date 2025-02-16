package com.priyanshuRaj.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {


    public void compile(){
        System.out.println("Compiled successfully but faster");
    }
}

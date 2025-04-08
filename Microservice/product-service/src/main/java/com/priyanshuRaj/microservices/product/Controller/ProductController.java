package com.priyanshuRaj.microservices.product.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping("/create")
    public void CreateProdcut(){

    }

    @GetMapping("/fetchProduct")
    public void getProduct(){}
}


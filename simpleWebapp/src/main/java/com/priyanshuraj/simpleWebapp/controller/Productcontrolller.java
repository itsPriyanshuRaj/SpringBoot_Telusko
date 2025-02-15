package com.priyanshuraj.simpleWebapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.priyanshuraj.simpleWebapp.model.Product;
import com.priyanshuraj.simpleWebapp.service.productService;

@RestController
public class Productcontrolller {
    
    @Autowired
    productService service;

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/getProducts/{prodId}")
    public Product getProductbyID(@PathVariable int prodId){
        return service.getProductbyID(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/updateProducts")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }


    @DeleteMapping("/deleteProduct/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}

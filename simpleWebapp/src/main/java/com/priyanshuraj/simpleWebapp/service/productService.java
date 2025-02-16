package com.priyanshuraj.simpleWebapp.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshuraj.simpleWebapp.model.Product;
import com.priyanshuraj.simpleWebapp.repository.productRepo;

@Service
public class productService {

    @Autowired
    productRepo repo;

    // List<Product> products = new ArrayList<>( Arrays.asList(
    //     new Product(101, "Mobile", 5000), 
    //     new Product(102, "Bike",9000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }    

    public Product getProductbyID(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}

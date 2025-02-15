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

    List<Product> products = new ArrayList<>( Arrays.asList(
        new Product(101, "Mobile", 5000), 
        new Product(102, "Bike",9000)));

    public List<Product> getProducts(){
        return products;
    }    

    public Product getProductbyID(int prodId){
        return products.stream().filter(p ->p.getProdID() == prodId).findFirst().orElse(
            new Product(404, "Not found", 00000));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index =0;

        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProdID() == prod.getProdID()){
                index=i;
            }
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId){
        int index =0;

        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProdID() == prodId){
                index=i;
            }
        }
        products.remove(index);
    }
}

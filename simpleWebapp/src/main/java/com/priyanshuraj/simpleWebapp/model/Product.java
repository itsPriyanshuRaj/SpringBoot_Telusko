package com.priyanshuraj.simpleWebapp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {

    @Id
    private int prodID;
    private String prodName;
    private int prodPrice;
    
    public Product() {
    }


    public Product(int prodID, String prodName, int prodPrice) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

   
    public int getProdID() {
        return prodID;
    }
    public void setProdID(int prodID) {
        this.prodID = prodID;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    

    public int getProdPrice() {
        return prodPrice;
    }
    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Product [prodID=" + prodID + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
    }

    
    
}

package com.priyanshuraj.simpleWebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanshuraj.simpleWebapp.model.Product;

@Repository
public interface productRepo extends JpaRepository<Product, Integer> {

}

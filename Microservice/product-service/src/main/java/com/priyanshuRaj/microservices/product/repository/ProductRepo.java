package com.priyanshuRaj.microservices.product.repository;

import com.priyanshuRaj.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {
}

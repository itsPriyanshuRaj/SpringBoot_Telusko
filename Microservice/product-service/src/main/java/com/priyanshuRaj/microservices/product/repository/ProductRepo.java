package com.priyanshuRaj.microservices.product.repository;

import com.priyanshuRaj.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {
}

package com.priyanshuRaj.microservices.product.service;

import com.priyanshuRaj.microservices.product.dto.ProductRequest;
import com.priyanshuRaj.microservices.product.model.Product;
import com.priyanshuRaj.microservices.product.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;


//    public ProductService(ProductRepo productRepo) {
//        this.productRepo = productRepo;
//    }

   public void createProduct(ProductRequest productRequest){
       Product product = Product.builder()
               .name(productRequest.name())
               .description(productRequest.description())
               .price(productRequest.price())
               .build();
       productRepo.save(product);

    }
}

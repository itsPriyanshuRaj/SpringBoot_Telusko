package com.priyanshuRaj.microservices.product.service;

import com.priyanshuRaj.microservices.product.dto.ProductRequest;
import com.priyanshuRaj.microservices.product.dto.ProductResponse;
import com.priyanshuRaj.microservices.product.model.Product;
import com.priyanshuRaj.microservices.product.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepo productRepo;

   public ProductResponse createProduct(ProductRequest productRequest){
       Product product = Product.builder()
               .name(productRequest.name())
               .description(productRequest.description())
               .price(productRequest.price())
               .build();
       productRepo.save(product);

       log.info("Product created successfully");
       return new ProductResponse(product.getId(), product.getName(), product.getPrice(), product.getDescription());
    }


public List<ProductResponse> getProduct() {
    return productRepo.findAll().stream()
    .map(product-> new ProductResponse(product.getId(), product.getName(), product.getPrice(), product.getDescription())).toList();

    // throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
}
}

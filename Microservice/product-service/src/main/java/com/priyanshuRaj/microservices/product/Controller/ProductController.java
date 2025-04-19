package com.priyanshuRaj.microservices.product.Controller;

import com.priyanshuRaj.microservices.product.dto.ProductRequest;
import com.priyanshuRaj.microservices.product.dto.ProductResponse;
import com.priyanshuRaj.microservices.product.model.Product;
import com.priyanshuRaj.microservices.product.service.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/home")
    public String greet(){
        return "Hello from product-service microservices";
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse CreateProdcut(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping("/fetchProduct")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProduct(){
        return productService.getProduct();
    }
}


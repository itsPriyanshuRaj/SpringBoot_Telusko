package com.priyanshuRaj.microservices.product.Controller;

import com.priyanshuRaj.microservices.product.dto.ProductRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateProdcut(@RequestBody ProductRequest productRequest){

    }

    @GetMapping("/fetchProduct")
    public void getProduct(){}
}


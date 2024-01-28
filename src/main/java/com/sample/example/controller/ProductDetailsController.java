package com.sample.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sample.example.DTO.ProductDetailsDTO;
import com.sample.example.entites.ProductDetails;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductDetailsController {

    @Autowired
    private com.sample.example.service.ProductDetailsService ProductDetailsService;

    @GetMapping
    public ResponseEntity<List<ProductDetails>> getAllProducts() {
        return new ResponseEntity<List<ProductDetails>>(ProductDetailsService.getAllProducts(), HttpStatus.CREATED);
   
    }

    @GetMapping("/{productId}")
    public ProductDetails getProductById(@PathVariable Long productId) {
        return ProductDetailsService.getProductById(productId);
    }

    @PostMapping
    public ProductDetails createProduct(@RequestBody ProductDetails ProductDetails) {
        return ProductDetailsService.createProduct(ProductDetails);
    }

//    @PutMapping("/{productId}")
//    public ProductDetails updateProduct(@PathVariable Long productId, @RequestBody ProductDetails updatedProduct) {
//        return ProductDetailsService.updateProduct(productId, updatedProduct);
//    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        ProductDetailsService.deleteProduct(productId);
    }
}

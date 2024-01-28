package com.sample.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.example.DTO.ProductDetailsDTO;
import com.sample.example.entites.ProductDetails;
import com.sample.example.repository.ProductDetailsRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductDetailsService {

    @Autowired
    private ProductDetailsRepository productRepository;
    ObjectMapper objectMapper = new ObjectMapper();
    
    
    public void ProductMapperService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<ProductDetails> getAllProducts() {
    	
        return productRepository.findAll();
    }
    
//    public List<ProductDetailsDTO> mapProductsToDTOs(List<ProductDetails> products) {
//        return products.stream()
//                .map(this::mapProductToDTO)
//                .collect(Collectors.toList());
//    }
//    public ProductDetailsDTO mapProductToDTO(ProductDetails product) {
//    	log.info("inside mapproductToDto converter...");
//    	ProductDetailsDTO productDTO = objectMapper.convertValue(product, ProductDetailsDTO.class);
//        return productDTO;
//    }

    public ProductDetails getProductById(Long productId) {
    	System.out.println("inside getProductById ");
    	Optional<ProductDetails> productDetails=productRepository.findById(productId);
    	if(null!=productDetails) {
    		System.out.println("data is present"+productDetails.toString());
    	}
        return productDetails.get();
    }

    public ProductDetails createProduct(ProductDetails ProductDetails) {
        return productRepository.save(ProductDetails);
    }

//    public ProductDetails updateProduct(Long productId, ProductDetails updatedProduct) {
//        ProductDetails existingProduct = productRepository.findById(productId).orElse(null);
//        if (existingProduct != null) {
//            existingProduct.setName(updatedProduct.getName());
//            existingProduct.setDescription(updatedProduct.getDescription());
//            existingProduct.setPrice(updatedProduct.getPrice());
//            existingProduct.setStockQuantity(updatedProduct.getStockQuantity());
//            existingProduct.setCategory(updatedProduct.getCategory());
//            return productRepository.save(existingProduct);
//        }
//        return null;
//    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}

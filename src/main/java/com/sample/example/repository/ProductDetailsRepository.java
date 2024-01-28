package com.sample.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.example.entites.ProductDetails;




public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Long> {
	
//	ProductDetails finbyId(Long id);
}

package com.sample.example.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@JsonProperty(value = "ProductId")
	private Long productId;

//	@JsonProperty(value = "Name")
	@Column(name = "name")
	private String name;
//	@JsonProperty(value = "Description")
	private String description;
//	@JsonProperty(value = "Price")
	private double price;
//	@JsonProperty(value = "StockQuantity")
	private int stockQuantity;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

}

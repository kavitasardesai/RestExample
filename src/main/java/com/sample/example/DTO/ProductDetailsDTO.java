package com.sample.example.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public interface ProductDetailsDTO {
	public String getName();

	public String getDescription();

	public double getPrice();

}

package com.xworkz.refrigerator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Stabilizer {
	@Value("Microtech")
	private String brand;
	@Value("3900")
	private double price;

	public Stabilizer() {
		
		System.out.println(this.getClass().getSimpleName() + "bean created");

	}

	public Stabilizer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stabilizer [brand=" + brand + ", price=" + price + "]";
	}
	


}

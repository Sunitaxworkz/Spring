package com.xworkz.foot;

public class Footwear {
	public String brand;
	public double price;
	public String color;

	public Material material;

	public Footwear(String brand, double price, String color, Material material) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.material = material;
	}

	public void walk() {
		System.out.println("Invoked walk");
		material.protection();
	}

	@Override
	public String toString() {
		return "Footwear [brand=" + brand + ", price=" + price + ", color=" + color + ", material=" + material + "]";
	}

}

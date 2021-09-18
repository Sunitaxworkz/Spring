package com.xworkz.fruit;

public class Fruit {
	public String name;
	public String color;
	public int price;
	public Vitamin vitamin;

	public Fruit(String name, String color, int price, Vitamin vitamin) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.vitamin = vitamin;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public void gainWeight() {
		System.out.println("Invoked gainWeight");
	}

	public void toAvoidDisease() {
		System.out.println("Invoked toAvoidDisease");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Vitamin getVitamin() {
		return vitamin;
	}

	public void setVitamin(Vitamin vitamin) {
		this.vitamin = vitamin;
	}
	
}

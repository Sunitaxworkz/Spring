package com.xworkz.airport;

public class Airport {
	private String name;
	private String location;

	public Airport(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

	public void setName(String name) {
		System.out.println("Invoked setName");
		this.name = name;
	}

	public void setLocation(String location) {
		System.out.println("Invoked setLocation");
		this.location = location;
	}

	public void runWay() {

		System.out.println("invoked runWay");
	}

	public void maintenance() {
		System.out.println("Invoked maintenance");

	}

}

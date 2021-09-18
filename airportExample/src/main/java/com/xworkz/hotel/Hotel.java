package com.xworkz.hotel;

public class Hotel {
	private String name;
	private String location;

	public Hotel(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", location=" + location + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}

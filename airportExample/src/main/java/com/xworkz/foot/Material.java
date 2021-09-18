package com.xworkz.foot;

public class Material {
	public String rubber;
	public String plastic;
	public String cloth;

	public Material(String rubber, String plastic, String cloth) {
		super();
		this.rubber = rubber;
		this.plastic = plastic;
		this.cloth = cloth;
	}

	public void protection() {
		System.out.println("Invoked protection");
	}
}

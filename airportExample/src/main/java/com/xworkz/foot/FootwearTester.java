package com.xworkz.foot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootwearTester {

	public static void main(String[] args) {
		String beanConfigurationPath = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationPath);
		Footwear footwear = container.getBean(Footwear.class);
		System.out.println(footwear.brand);
		System.out.println(footwear.price);
		System.out.println(footwear.color);

		System.out.println(footwear.material.cloth);
		System.out.println(footwear.material.plastic);
		System.out.println(footwear.material.rubber);
		
		footwear.walk();
	}

}

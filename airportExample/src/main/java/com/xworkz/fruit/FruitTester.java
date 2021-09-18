package com.xworkz.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FruitTester {

	public static void main(String[] args) {
		String beanConfigurationPath = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationPath);
		Fruit fruit = container.getBean(Fruit.class);
		System.out.println(fruit.name);
		System.out.println(fruit.color);
		System.out.println(fruit.price);

		System.out.println(fruit.vitamin.type);
		System.out.println(fruit.vitamin.fatSoluble);
		System.out.println(fruit.vitamin.waterSoluble);
		fruit.gainWeight();

	}

}

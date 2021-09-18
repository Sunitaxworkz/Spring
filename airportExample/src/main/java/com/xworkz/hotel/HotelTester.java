package com.xworkz.hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelTester {

	public static void main(String[] args) {
		String beanConfigurationPath = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationPath);
		Hotel hotel = (Hotel) container.getBean("hotel");

		System.out.println(hotel);

		String s1 = container.getBean(String.class);
		System.out.println("String:" + s1);

		Integer i1 = container.getBean(Integer.class);
		System.out.println("Integer:" + i1);

		Double i2 = container.getBean(Double.class);
		System.out.println("Double:" + i2);

		Float i3 = container.getBean(Float.class);
		System.out.println("Float:" + i3);

		Long i4 = container.getBean(Long.class);
		System.out.println("Long:" + i4);

		Boolean i5 = container.getBean(Boolean.class);
		System.out.println("Boolean:" + i5);

		Short i6 = container.getBean(Short.class);
		System.out.println("Short:" + i6);
	}

}

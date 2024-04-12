package com.mphasis.day02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/day02/springconfig.xml");
		
		/*
		 * Car c = context.getBean(Car.class); c.drive();
		 */

		
		  Music m = context.getBean("m", Music.class);
		  
		  System.out.println(m);
		 
	}
}

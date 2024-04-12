package com.mphasis.day02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/day02/config.xml");

		Employee e = context.getBean("emp", Employee.class);

		e.setId(1001); 
		e.setName("Henry");

		System.out.println(e);

		context.registerShutdownHook();
	}
}

package com.mphasis.day02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/day02/spring.xml");
    
    Student s = context.getBean("s",Student.class);
    
    System.out.println(s);
    
    context.registerShutdownHook();
}
}

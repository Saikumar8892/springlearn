package com.mphasis.day03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	
  public static void main(String[] args) 
  {
	  AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/day03/config.xml");  
	  //Here only while loading itself it will perform setter injection and Init method will be called
      
	  Patient p = context.getBean("p",Patient.class);
	  p.message();
	  
	  Department d = context.getBean("d",Department.class);
	  d.display();
	  
	  context.registerShutdownHook();
      
  }
}

package com.mphasis.day03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/day03/spring.xml");  
       // here only instance get created, so same for all
       Employee e = context.getBean("emp",Employee.class);
       e.setId(10);
       e.setName("Harsha");
       System.out.println(e.hashCode());
       
		
	   Employee e2 = context.getBean("emp",Employee.class); 
	   e2.setId(11);
	   e2.setName("Asha"); 
	   System.out.println(e2.hashCode());
		 
       context.registerShutdownHook();
    }
}

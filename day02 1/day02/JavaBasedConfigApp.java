package com.mphasis.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigApp 
{
  public static void main(String[] args) 
  {
	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // class which has @configuration
     Instructor instructor = context.getBean("instr",Instructor.class);
     System.out.println(instructor);
     
     
     Instructor instructor2 = context.getBean("instr2",Instructor.class);
     instructor2.setId(1002);
     instructor2.setName("Charlie");
     System.out.println(instructor2);
     

  }
}

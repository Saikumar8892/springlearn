package com.mphasis.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {

		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("com/mphasis/list/springList2.xml");
		  	  
		  // ApplicationContext c = new FileSystemXmlApplicationContext(""); When config file is in system C Drive 
		  //Hospital h = context.getBean("h",Hospital.class); 
		 // System.out.println(h);
		  
		   
	       Employee e = context.getBean("emp",Employee.class); 
	       System.out.println(e);
           
	}
}

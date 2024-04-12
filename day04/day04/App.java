package com.mphasis.day04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/day04/config.xml");
        SystemArchitecture obj = context.getBean(SystemArchitecture.class);
       
        //obj.dataAccessOperations();
       // obj.dataManipulation();
        
        //System.out.println(obj.getOperation());
        
        //obj.validate(10);
        
        obj.dataAccessOperations();

    }

}

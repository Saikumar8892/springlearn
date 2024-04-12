package com.mphasis.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mphasis/map/springMap.xml");
        Customer c = context.getBean("cust",Customer.class);
        System.out.println(c);        
    }
}

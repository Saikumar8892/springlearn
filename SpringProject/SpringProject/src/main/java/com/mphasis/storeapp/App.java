package com.mphasis.storeapp;


import java.time.LocalDate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.domain.Product;

import com.mphasis.dao.ProductDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	//Bootstrap the spring core container
    	//child of Application context
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ProductDaoImpl prodDaoImpl = context.getBean(ProductDaoImpl.class);
        
        /*
        System.out.println(prodDaoImpl.insert(new Product("LG",38787,LocalDate.now())));
        System.out.println(prodDaoImpl.insert(new Product("Samsung",767544,LocalDate.now())));
        System.out.println(prodDaoImpl.insert(new Product("Iphone",247347,LocalDate.now())));
        
        System.out.println(prodDaoImpl.update(new Product(2,"Nokia",897711,LocalDate.now())));
        */
        //System.out.println(prodDaoImpl.delete(2));

        //  System.out.println(prodDaoImpl.getAllProducts());
        
        System.out.println(prodDaoImpl.getProductById(1));
        
        
        context.registerShutdownHook();
        context.close();
    }
}


package com.mphasis.storeapp;


import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.dao.ProductDaoImpl;
import com.mphasis.domain.Product;
import com.mphasis.storeapp.config.Initializer;

public class App 
{
    public static void main( String[] args )
    {
    	//AnnotationConfig introduced in 2.5 spring version
    	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Initializer.class);
        ProductDaoImpl prodDaoImpl = context.getBean(ProductDaoImpl.class);
        
        System.out.println(prodDaoImpl.insert(new Product("LG",38787,LocalDate.now())));
        System.out.println(prodDaoImpl.insert(new Product("Samsung",767544,LocalDate.now())));
        System.out.println(prodDaoImpl.update(new Product(2,"Samsung",897711,LocalDate.now())));
        System.out.println(prodDaoImpl.getAllProducts());
        System.out.println(prodDaoImpl.getProductById(2));
        System.out.println(prodDaoImpl.delete(2));
        context.registerShutdownHook();
        context.close();
    }
}


package com.mphasis.storeapp;

import java.time.LocalDate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.storeapp.config.Initializer;
import com.mphasis.storeapp.dao.ProductDAO;
import com.mphasis.domain.Product;

public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Initializer.class);
        ProductDAO prodDaoImpl = context.getBean("productDao",ProductDAO.class);
        
        System.out.println("----------------Insert 3 Records-----------------------------------");
        System.out.println(prodDaoImpl.insert(new Product("LG",38787,LocalDate.now())));
        System.out.println(prodDaoImpl.insert(new Product("Samsung",767544,LocalDate.now())));
        System.out.println(prodDaoImpl.insert(new Product("Sony",45555,LocalDate.now())));
        
        System.out.println("----------------Update 1 Record-----------------------------------");
        prodDaoImpl.update(new Product(2,"Samsung",897711,LocalDate.now()));
   
        System.out.println("----------------Fetch All Records-----------------------------------");
        System.out.println(prodDaoImpl.getAllProducts());
        
        System.out.println("----------------Fetch single Record-----------------------------------");
        System.out.println(prodDaoImpl.getProductById(2));
        
        System.out.println("----------------Delete 1 Record-----------------------------------");
         
        System.out.println(prodDaoImpl.delete(2));
        
        context.registerShutdownHook();
        context.close();

    }
}


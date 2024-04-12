package com.mphasis.day02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mphasis.day02"}) 
//@ComponentScan(basePackages = {"com.mphasis.day02","com.mphasis.day03"}) 
public class AppConfig { // this class is like an XML file for me
	
	@Bean("instr") // Tell IoC container that i want this bean to be part of IoC
	public Instructor getInstructor() // I need a method which returns the instructor object
	{
		return new Instructor(1001,"Paul");
	}

}

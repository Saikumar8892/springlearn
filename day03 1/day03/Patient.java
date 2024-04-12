package com.mphasis.day03;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient //implements InitializingBean,DisposableBean
{
 
	private int patientId;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	/*
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Init By Initializing Bean");
		System.out.println("Patient Id "+patientId);
	}

	public void destroy() throws Exception {
		System.out.println("Destroy by Disposable Bean");
	}
	*/
	
	
	//@PostConstruct
	public void customInit()
	{
		System.out.println("Custom Init Patient");
	}
	
	//@PreDestroy
	public void customDestroy()
	{
		System.out.println("Custom Destroy Patient");
	}
	
	
	public void message()
	{
		System.out.println("Thank you for Visiting us !!!");
	}
}
	

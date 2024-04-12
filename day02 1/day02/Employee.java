package com.mphasis.day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp") // id for this Bean
public class Employee {
	  private int id;
	  private String name;
	    
	public Employee() {
		super();
	}

	public Employee(int id, String name) 
	{
		super();
		System.out.println("Para Constr");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	 
	}


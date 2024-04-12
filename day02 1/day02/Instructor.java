package com.mphasis.day02;

import org.springframework.stereotype.Component;

@Component("instr2")
public class Instructor {
	 private int id;
	 private String name;
	 
	public Instructor() {
		super();
	}
	public Instructor(int id, String name) {
		super();
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
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	 
	}


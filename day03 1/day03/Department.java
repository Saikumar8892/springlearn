package com.mphasis.day03;

public class Department 
{ 
  private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void customInit()
{
	System.out.println("Custom Init Department");
}

public void customDestroy()
{
	System.out.println("Custom Destroy Department");
}

@Override
public String toString() {
	return "Department [name=" + name + "]";
}
  
public void display()
{
	System.out.println(name+" are having suffecient Doctors");
}
}

package com.mphasis.day02;

public class Instrument 
{
  private String name;
  private String catagory;
public Instrument() {
	super();
}
public Instrument(String name, String catagory) {
	super();
	this.name = name;
	this.catagory = catagory;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCatagory() {
	return catagory;
}
public void setCatagory(String catagory) {
	this.catagory = catagory;
}
@Override
public String toString() {
	return "Instrument [name=" + name + ", catagory=" + catagory + "]";
}
  
}

package com.mphasis.list;

import java.util.List;

public class Hospital 
{
  private String name;
  private List<String> dept;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getDept() {
	return dept;
}
public void setDept(List<String> dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Hospital [name=" + name + ", dept=" + dept + "]";
}
}

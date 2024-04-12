package com.day01;

public class TestPen {
  
	public static void main(String[] args) 
	{
		
	   Pen p = new Pen();
	   p.setInkQty(10);
	   p.setName("Gel Pen");
	   System.out.println(p.getInkQty()+ " "+ p.getName());
	
    }
}

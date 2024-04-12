package com.day01;

public class TestShape 
{
 public static void main(String[] args) 
 {
	//left hand side Ref is Parent and Right Hand side Object is Child
	Shape s1 = new Rectangle(); // Object Casting
	s1.draw();
	
	Shape s2 = new Circle();
	s2.draw();
	
	//vice versa not possible
	//Child Reference to Parent Object
	//Rectangle r = new Shape();
 }
}

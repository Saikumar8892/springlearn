package com.day01;

public class Mechanic 
{
   String name;
   public void test(Vehicle v)
   {
	   System.out.println(name+ " is Testing "+v.name);
	   v.drive();
   }
}

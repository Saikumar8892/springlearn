package com.day01;

public class CompileTimePolymophism 
{
   public void add()
   {
	   System.out.println("Default");
   }
   public void add(int i)
   {
	   System.out.println("int");
   }
   public void add(String m)
   {
	   System.out.println("String");
   }
   
   public void add(double x,float y)
   {
	   System.out.println("double,float");
   }
   public void add(float  y ,double x)
   {
	   System.out.println("float,double");
   }
   
   public static void main(String[] args) {
	   CompileTimePolymophism ctp = new CompileTimePolymophism();
	   ctp.add();
	   ctp.add(7.8,23.1f);
	   ctp.add("Two");
	   ctp.add(90);
	   ctp.add(1f,90.0);
}
}

package com.day01;

public class Car 
{
   public int milage;
   public String model;
   public double speed;
   
   public Car()
   {
	 System.out.println("Default Constructor");
	 milage = 20;
	 model = "SUV100E10";
	 speed = 110.2;
   }
   
   public Car(int m,String mo,double sp)
   {
	   System.out.println("Parameterized Constructor");
	   milage = m;
	   model = mo;
	   speed = sp;
   }
   
   public Car(int mi,double s)
   {
	   milage = mi;
	   speed = s;
   }
   
   public static void main(String[] args) {
	 Car c = new Car();  // creating an Object (Default)
	 System.out.println(c.milage + " "+ c.model + " " + c.speed );
	 
	 Car c1 = new Car(10,"Honda123",50); // Parameterized
	 System.out.println(c1.milage + " "+ c1.model + " " + c1.speed );
	 
	 Car c2 = new Car(25,85.5); // 3rd 
	 System.out.println(c2.milage + " "+ c2.model + " " + c2.speed );
}
}

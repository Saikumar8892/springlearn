package com.day01;

public class Employee {
   String name = "Nikhil";
   int age = 30;
   double salary = 5000.50;
   
   public void eat()
   {
	   System.out.println(name + " is Eating");
   }
   
   public void work(double hours) // parameterized Function
   {
	   System.out.println(name +" is Working for "+hours);
   }
   
   public double calculateBasicSalary() // funtion with return type
   {
	   double basicSalary = salary * 0.7;
	   return basicSalary; // compulsory and  last statement
   }
   
   public double myPFAmount(double years,String empId)
   {
	   System.out.println("Employee Id "+empId);
	   return years * salary;
   }
   
   public static void main(String[] args) {
	   Employee e = new Employee();
	   System.out.println("Name "+e.name+" Age "+e.age+" Salary "+e.salary);
	   e.eat();
	   e.work(4.5);
	   
	   double value = e.calculateBasicSalary();
	   System.out.println(value);
	   
	   System.out.println(e.calculateBasicSalary()); // only return type functions
	   
	   System.out.println(e.myPFAmount(2.5, "E1001"));
}
}

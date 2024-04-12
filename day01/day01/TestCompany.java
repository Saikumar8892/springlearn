package com.day01;

public class TestCompany {
   public static void main(String[] args) {
	 
	  Manager m = new Manager();
	  m.paySalary();
	  m.giveBonus();
	  
	  System.out.println("-----------------");
	  
	  Accountant a = new Accountant();
	  a.paySalary();
	  a.giveBonus();
	  
	}
} 

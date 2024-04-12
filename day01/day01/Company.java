package com.day01;

public abstract class Company 
{
  String name = "Mphasis";
  
  public abstract void paySalary(); // Incomplete or Abstract Method
  
  public void giveBonus() // concrete or complete Method
  {
	  System.out.println("All Employees receives Bonus");
  }
 
}

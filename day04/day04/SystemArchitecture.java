package com.mphasis.day04;

import org.springframework.stereotype.Component;

@Component
public class SystemArchitecture // It is a Bean class having a simple method
{
	public void dataAccessOperations()
	{
		System.out.println("Accessing Data");
	}
	
	
	public void dataDisplay()
	{
		System.out.println("Displaying Data");
	}
	
	public void dataManipulation()
	{
		System.out.println("Manupilating Data");
	}

    public int getOperation()
    {
    	System.out.println("Getting Operation ");
    	return 1;
    }
    
    
    public void validate(int age) // This method may throw an exception
    {
    	if(age<18)
    		throw new ArithmeticException("Not Valid Age");
    	else
    		System.out.println("Thanks for Voting");
    			
    }
    
}

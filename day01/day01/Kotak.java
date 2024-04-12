package com.day01;

public class Kotak extends Bank{
	float loanInterest = 10.8f;
	
	public void applyLoan()
	{
		System.out.println(accountNo+" is Applying Loan which has "+loanInterest+ "% as Interest");
	}
}

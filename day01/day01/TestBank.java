package com.day01;

public class TestBank {
   public static void main(String[] args) {
	Bank b = new Bank();
	System.out.println(b.accountNo+" "+b.rateOfInterest);
	System.out.println(b.getAccountType());
	
	System.out.println("-------------------");
	Kotak k = new Kotak();
	k.accountNo = "K10001";
	k.rateOfInterest = 2.3f;
	System.out.println(k.getAccountType());
	System.out.println(k.rateOfInterest);	
	k.applyLoan();
	
	System.out.println("-------------------");
	Axis a = new Axis();
	a.accountNo = "Ax1002";
	a.rateOfInterest = 5.5f;
	System.out.println(a.getAccountType());
	System.out.println(a.rateOfInterest);
	a.applyInsurance();
	
}
}

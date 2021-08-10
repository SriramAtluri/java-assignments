package com.devlabs.lab3;

public class Bank2UK implements BankInterface {

	public void getInterest(double principal, double days, double rate )
	{
		
		
		double interest = (principal) * (days/365) * (rate);
		System.out.println("Bank2 Details");
		System.out.println("Principal: "+principal+" days: "+days+" rate: "+rate);
		
		System.out.println("Interest:"+interest);
		
	}

}

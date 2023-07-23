package com.overridingDemo;

public class RBIBank {
	
	public void calculateSI(int amount ,int year, float interest) 
	{
		float si  =  (amount*year*interest)/100;
		System.out.println("SI by RBI>>"  +si);
	}
		
	public void calculateSI(float interest,int amount,int year)
	{
		float si=(amount*year*interest)/100;
		System.out.println("SI by RBI>>" +si);
	}

}

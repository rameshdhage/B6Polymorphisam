package com.overridingDemo;

public class HDFCBank 
{
	public void calculateSI(int amount, int years, float interest)
	{
		double si = ((amount * years * interest * 1.50) / 100);
		System.out.println("SI by HDFC bank>>" + si);

}}

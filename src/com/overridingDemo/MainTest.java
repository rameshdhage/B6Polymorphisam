package com.overridingDemo;



public class MainTest {

	public static void main(String[] args) {

		RBIBank bank = new RBIBank();
		bank.calculateSI(10000, 5, 7.5f);
		
		
		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.calculateSI(10000, 5, 7.5f);
		
	
	

}
}
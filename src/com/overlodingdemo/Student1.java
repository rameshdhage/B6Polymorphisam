package com.overlodingdemo;

public class Student1 {
	
	  protected void calculateTotal(int sub1,int sub2) 
	  {
		 int result=sub1+sub2;
		
	  }
	private void calculateTotal(int sub1,int sub2,int sub3) 
	{
		int result=sub1+sub2+sub3;
	    
		
	}
	
	public static void main(String[] args) {
		
		Student ramesh =new Student();
	int result=	ramesh.calculateTotal(98,90);
		System.out.println("ramesh total markes>>"+result);
		Student satish =new Student();
		
		System.out.println("satish total marks>>"+satish.calculateTotal(97,87));
		
		Student deepak =new Student();
		int output=deepak.calculateTotal(98,90,78);
		System.out.println("deepak total marks>>" +output);
		
		
	}
	

}

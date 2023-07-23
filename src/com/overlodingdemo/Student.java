package com.overlodingdemo;

public class Student {
	
	public int calculateTotal(int sub1,int sub2) {
		int result=sub1+sub2;
		return result;
	}
    protected int calculateTotal(int sub1,int sub2, int sub3) {
    	int result=sub1+sub2+sub3;
    	return result;
    	
    }
	public static void main(String[] args) {
		Student ramesh =new Student();
	int output	=ramesh.calculateTotal( 90,89);
		System.out.println("total mark ramesh>>"   +output);
		Student satish =new Student();
	int result	=satish.calculateTotal(98,86);
		System.out.println("total marks >>"  +result);
		
		Student deepak=new Student();
	int store	=deepak.calculateTotal(98,87,98);
		System.out.println("total marks>>"  +store);
		
		
		
	}
	
	
	
}

package com.overlodingdemo;

public class Automaticpramotion {
	
	public void m1(int i) {
		System.out.println("int -arg method >>>"+i);
	}
	public void m1(float f) {
		System.out.println("float -arg method>>"+f);
	}
	
	public static void main(String[] args) {
		Automaticpramotion auto=new Automaticpramotion();
		auto.m1(23);
		auto.m1(5.3f);
		auto.m1('a');
		auto.m1(10l);
		//auto.m1(10.5d);no pramotion fail
		
		
		
	}

}

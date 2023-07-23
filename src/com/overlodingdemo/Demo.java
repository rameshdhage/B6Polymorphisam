package com.overlodingdemo;

public class Demo {
	
	public void m1() {
		System.out.println("no_arg method>>");
	}
	public void m1(int i) {
		System.out.println("int_arg method>>"+i);
	}
	public void m1(double d) {
		System.out.println("double_arg method>>"+d);
	}
	public void m1(String s) {
		System.out.println("String _arg mehod>>"+s);
	}

	public static void main(String[] args) {
		Demo demo=new Demo();
	   demo.m1();
	   demo.m1(10);
	   demo.m1(10.7);
	   demo.m1("ramesh nagorao dhage");
	   
	}

}

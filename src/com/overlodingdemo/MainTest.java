package com.overlodingdemo;

public class MainTest {
public static void main(String args[]) {
	X x=new X();
	OverloadingDemo demo=new OverloadingDemo();
	demo.test(x);// X Class test method
	
	Y y=new Y();
	demo.test(y);// Y Class  test method
	
	Z z=new Z();
	demo.test(z);//Z Class test  method
	
	Y y1=new Z();
	demo.test(y1);// Y Class test method
	
     X x1=new Z();

	demo.test(x1);// Z Class test method
}
	
	
	
	
}

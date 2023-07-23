package com.overlodingdemo;

public class OverloadingDemo {

	public void test(X x) {
		System.out.println("X class test method");
	}
	void test(Y y) {
		System.out.println("Y class test method");
	}
	void test(Z z) {
		System.out.println("Z class test method");
	}
}

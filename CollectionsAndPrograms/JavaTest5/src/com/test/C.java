package com.test;

public class C {
	
	static C o = new C();
	
	private C() {
		
	}
	
	public static C getC() {
		return o;
	}
	public int getSum(int a, int b) {
		return a+b;
	}
}

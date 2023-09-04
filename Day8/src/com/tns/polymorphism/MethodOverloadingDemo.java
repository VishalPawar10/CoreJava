package com.tns.polymorphism;

public class MethodOverloadingDemo {
	
	void add() {
		int a=10, b=20, c;
		c= a+b;
		System.out.println("Addition of a and b :"+c);
	}
	
	void add(int a, int b) {
		int c= a + b;
		System.out.println("Addition of a and b using int :"+c);
	}
	
	void add(int a, double b) {
		double c = a + b;
		System.out.println("Addition of a and b using double datatype :"+c);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo d = new MethodOverloadingDemo();
		d.add();
		d.add(10, 25);
		d.add(21, 2315.0);
	}

}

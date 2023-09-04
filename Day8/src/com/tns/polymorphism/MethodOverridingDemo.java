package com.tns.polymorphism;

class Shape{
	void draw() {
		System.out.println("Can't define the shape ");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Sqaure Shape");
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		Square s = new Square();
		s.draw();
	}

}

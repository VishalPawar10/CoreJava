package com.tns.inheritenc;

class Parent{
	int a=10;

	
}

class Child extends Parent{
	int a=20;
	void display() {
		System.out.println("This is child class a :" + super.a);
		System.out.println("This is child class a :" + a);
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
	
	}

}

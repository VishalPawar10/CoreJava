package com.tns.inheritenc;

class Parent1{
	int a=10;
	void display() {
		System.out.println("This is Parent class a :" + a);
		
	}
	
}

class Child1 extends Parent1{
	int a=20;
	void display() {
		super.display();
		System.out.println("This is Child class a :" + a);
	}
}


public class SuperKeyword2 {

	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		obj.display();
		
	
	}

}

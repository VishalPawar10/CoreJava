package com.tns.inheritenc;

class Parent2{
	Parent2(int a, int b) {
		int c= a+b;
		System.out.println("The sum of a and b in Parent Constructor......"+ c);
		
	}
	
}

class Child2 extends Parent2{
   
	Child2() {
		 super(100, 120);
		System.out.println("This is Child Constructor......");
	}
}

public class SuperConstruct {

	public static void main(String[] args) {
		Child2 obj = new Child2();

	}

}

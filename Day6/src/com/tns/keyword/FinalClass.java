package com.tns.keyword;

final class A{
	void run() {
		System.out.println("This is A class method.");
	}
}

class B extends A{
	void run() {
		System.out.println("This is B class method.");
	}
}

public class FinalClass {

	public static void main(String[] args) {
		B obj = new B();
		obj.run();

	}

}

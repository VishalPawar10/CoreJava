package com.tns.inheritenc;

class Super {
	void input() {
		System.out.println("What is your name: ");
	}
}

class Sub1 extends Super {
	void show() {
		System.out.println("My name is Oggy");
	}
}

class Sub2 extends Super {
	void display() {
		System.out.println("My name is Olivia");
	}
}

class Sub3 extends Super{
	void display2() {
		System.out.println("My name is Jack");
	}
}

public class HierarachiacalInheritence {

	public static void main(String[] args) {
		Sub1 name1 = new Sub1();
		name1.input();
		name1.show();
		
		Sub2 name2 = new Sub2();
		name2.input();
		name2.display();
		
		Sub3 name3 = new Sub3();
		name3.input();
		name3.display2();
		
		}

}

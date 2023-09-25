package com.tns.annotation;

class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	@Override
	void eatsomething() {
		// super.eatSomething();
		System.out.println("eating foods");
	}
}

class TestAnnotation1 {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.eatSomething();
	}
}
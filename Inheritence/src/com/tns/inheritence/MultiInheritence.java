package com.tns.inheritence;

class Operator1{
	int a,b,c;
	void add(){
		a=5;
		b=4;
		c=a+b;
		System.out.println("Addition of two numbers is :"+c);
	}
	void sub() {
		a=5;
		b=4;
		c=a-b;
		System.out.println("Substraction of two numbers is :"+c);
	}
	
}

class Operator2 extends Operator1{
	void mul() {
		a=10;
		b=2;
		c=a*b;
		System.out.println("Multiplication of two numbers is :"+c);
	}
	void div() {
		a=10;
		b=2;
		c=a/b;
		System.out.println("Division of two numbers is :"+c);
	}
}
class Operator3 extends Operator2{
	void rem() {
		a=10;
		b=2;
		c=a%b;
		System.out.println("Remainder of two numbers is :"+c);
	}
}


public class MultiInheritence {

	public static void main(String[] args) {
		Operator3 obj = new Operator3();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();

	}

}

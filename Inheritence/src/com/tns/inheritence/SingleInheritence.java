package com.tns.inheritence;

class Student{
	int rollno, marks;
	String name;
	
	void input() {
		System.out.println("Enter rollno, name, marks :");
	}
}

class Rohit extends Student{
	void display(){
	rollno = 21;
	marks = 99;
	name = "Rohit";
	System.out.println(rollno+" "+ name+" "+ marks);
	}
}

public class SingleInheritence {

	public static void main(String[] args) {
		Rohit obj = new Rohit();
		obj.input();
		obj.display();
	}

}

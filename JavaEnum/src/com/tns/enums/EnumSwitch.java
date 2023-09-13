package com.tns.enums;

enum Level2{
	LOW,
	MEDIUM,
	HIGH
}


public class EnumSwitch {

	public static void main(String[] args) {
		Level2 obj = Level2.HIGH;
		switch(obj) {
		case LOW:
			System.out.println("This is Low level");
			break;
		case MEDIUM:
			System.out.println("This is Medium Level");
			break;
		case HIGH:
			System.out.println("This is High Level");
			break;
		}
	}

}

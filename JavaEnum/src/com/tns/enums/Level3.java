package com.tns.enums;
enum Level4{
	LOW,
	MEDIUM,
	HIGH
}


public class Level3 {

	public static void main(String[] args) {
	
		
		for(Level4 myVar:Level4.values()) {
			System.out.println(myVar);
		}
	}

}

package com.tns.datetimeapi;
import java.time.*;

public class CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime myobj = LocalDateTime.now();
		System.out.println("The Date and Time is separated by T: "+myobj);
	}

}

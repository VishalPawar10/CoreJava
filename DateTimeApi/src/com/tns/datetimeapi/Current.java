package com.tns.datetimeapi;
import java.time.*;

public class Current {
	public static void main(String []args) {
		LocalDate obj = LocalDate.now();
		System.out.println("This Local Date :"+obj);
		
		LocalTime obj1 = LocalTime.now();
		System.out.println("This Local Time :"+obj1);
	}
}

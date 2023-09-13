package com.tns.datetimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Befor formating: "+myDateObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");
		
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: "+formattedDate);
	}

}

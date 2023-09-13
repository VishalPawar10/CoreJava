package com.tns.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample1 {

	public static void main(String[] args) {
		
	//First Way
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b1 = m.matches();
		System.out.println(b1);
		
		//Second Way
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		//Third way
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b3);
	}

}

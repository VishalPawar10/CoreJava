package com.tns.annotation;
import java.util.*;

public class TestAnnotation2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("Peter");
		list.add("John");
		list.add("Sam");
		list.add("Ross");
	      
		for(Object obj:list) {
			System.out.println(obj);
		}

	}

}

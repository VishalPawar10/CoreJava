package CollectionFramework;
import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("Tom");
		al.add("Jerry");
		al.add("Harry");
		al.add("Mike");
		al.add("Tom");
		
LinkedList<String> al2 = new LinkedList<String>();
		
		al2.add("Tom2");
		al2.add("Jerry2");
		
		al.addAll(al2);
		System.out.println("After invoking addAll:"+al);
		
	}

}

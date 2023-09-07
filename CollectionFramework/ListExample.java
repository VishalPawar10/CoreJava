package CollectionFramework;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("Mango");
		l.add("Kiwi");
		l.add("Banana");
		l.add("Apple");
		l.add("Pineapple");
		
		for(String fruit:l) {
			System.out.println(fruit);
		}
	}

}

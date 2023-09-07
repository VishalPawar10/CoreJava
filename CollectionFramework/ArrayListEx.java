package CollectionFramework;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
	    list.add("Avenger");
	    list.add("KTM");
	    list.add("YEZDI");
	    list.add("BMW");
	    list.add("JAWA");
	    
	    System.out.println("Returning Elements: "+list.get(2));
	    list.set(1, "Royal Enfield");
	    
	    for(String bikes:list) {
	    	System.out.println(bikes);
	    }
	}

}

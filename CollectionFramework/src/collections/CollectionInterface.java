package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionInterface {
	
	public static void main(String[] args) {
		
		Collection<String> c1 = new ArrayList<>();
		c1.add("Adam");
		c1.add("Bob");
		c1.add("Dave");
		c1.add("Adam");
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("Adam");
		c2.add("David");
		c2.add("Steve");
		c2.add("Mark");
		c2.add("Dave");
		
		System.out.println(c1);
		System.out.println(c2);
		
		//basic operations
		System.out.println(c1.size());  //returns an int 4
		System.out.println(c1.isEmpty());  //false
		System.out.println(c1.contains("Bob"));  //true
		System.out.println(c1.remove("Bob"));  //true
		System.out.println(c1);
		
		System.out.println("----------------");
		
		//bulk operations
		System.out.println(c2.containsAll(c1));  //true
		System.out.println(c2.retainAll(c1));  //true
		System.out.println(c2);  //[Adam, Dave] all common elements
		
		System.out.println(c2.addAll(c1)); //true
		System.out.println(c2);
		
		c2.removeAll(Collections.singleton("Adam"));  //removes all Adam from the list
		System.out.println(c2);
		
		System.out.println("-----------------");
		
		//converting to Array
		Object[] strArr = c2.toArray();
		System.out.println(Arrays.toString(strArr));
		
		//clear the collection
		c2.clear();
		System.out.println(c2.isEmpty());  //true
		
	}

}

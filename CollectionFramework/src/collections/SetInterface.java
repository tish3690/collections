package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		List<Integer> items = new ArrayList<>();

		items.add(10);
		items.add(23);
		items.add(344);
		items.add(475);
		items.add(344);
		items.add(36);
		items.add(36);
		
		System.out.println(items);  //[10, 23, 344, 475, 344, 36, 36]
		
		Collection<Integer> noDups = new HashSet<Integer>(items);
		
		System.out.println(noDups);  //[36, 23, 344, 10, 475]
		
		Collection<Integer> inOrder = new TreeSet<Integer>(items);	
		
		System.out.println(inOrder);  //[10, 23, 36, 344, 475]

	}

}

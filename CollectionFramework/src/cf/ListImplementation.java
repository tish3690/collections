package cf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListImplementation {
	
	public static void main(String[] args) {
		
		Collection<Integer> items= new ArrayList<Integer>();
				
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        items.remove(1);  //removes 2 - index
//        items.remove(1);  //removes 3 - index
//        
//        items.remove( new Integer(1) );  //removes 1 - value
        
//        System.out.println(items);
		
		System.out.println(items.isEmpty());
		
		List <Integer> ls1 = Arrays.asList(66,44,32,33);
		
		items.addAll(ls1);
		
		System.out.println(items);
		
		items.removeAll(ls1);
		
		System.out.println(items);
		
		List <Integer> ls2 = Arrays.asList(1,33);
		
		items.retainAll(ls2);
		System.out.println(items);
		
		

//        
//        for (int i = 0; i < items.size(); i++) {
//        	System.out.println();
//        }
//		
	}

}

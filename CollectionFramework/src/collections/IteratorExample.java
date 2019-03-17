package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		List<Integer> items= new ArrayList<>();  
	    
	    //System.out.println(items.isEmpty() );
	    items.add(10);
	    items.add(23);
	    items.add(344);
	    items.add(475);
	    items.add(36);
	    
	    System.out.println(items);
	        
	    Iterator<Integer> iter = items.iterator();
	        
	    while( iter.hasNext() ) {
	          
	        if(iter.next() > 100 )
	        iter.remove();

	    }
	    
	    System.out.println(items);
		
	}

}

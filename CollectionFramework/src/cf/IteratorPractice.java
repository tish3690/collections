package cf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

  public static void main(String[] args) {
    
    
    List<Integer> items= new ArrayList<>();  
    
    //System.out.println(items.isEmpty() );
    items.add(10);
        items.add(23);
        items.add(344);
        items.add(475);
        items.add(36);
        
        Iterator<Integer> iter = items.iterator();
        
        while( iter.hasNext() ) {
          
            //System.out.println( iter.next() );
            if(iter.next() > 100 )
              iter.remove();
          
        }
        
//        for (int i = 0; i < items.size(); i++) {
//            
//            if( items.get(i)  > 100 )   {
//              items.remove( items.get(i) ) ; 
//            }
//          
//    }
        
        /// WE CAN NOT REMOVE ITMES FROM COLLECTION WHILE ITERATING OVER USING FOR EACH LOOP 
//         for (Integer item : items) {
//      
//               if(item>100) {
//                 items.remove(item) ; 
//               }
//           
//     }
//        
        System.out.println(items);
        
        
//        System.out.println(  iter.hasNext()  );
//        System.out.println(  iter.next() );
//        System.out.println(  iter.next() );
//        
//        iter.remove();
//        System.out.println( items );
        
//        System.out.println(  iter.next() );
//        System.out.println(  iter.next() );
//        System.out.println(  iter.next() );
//        
        //System.out.println(  iter.next() );
        
        
        
        
    
    

  }

}
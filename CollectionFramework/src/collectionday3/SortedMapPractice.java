package collectionday3;

import java.util.*;
import java.util.Map.Entry;

public class SortedMapPractice {

  public static void main(String[] args) {
    
    
    //HashMap<Integer,String> cityMap = new HashMap<>();
    
    // Create KeyReverseComparator class to define your reverse order
    // or use lambda expression
    Comparator<Integer> ci = new KeyReverseComparator() ; 
    
    //Comparator<Integer> ci2 = Comparator.comparing( num -> -num) ; 
    
    // SortedMap<Integer,String> cityMap = new TreeMap<>( ci );

    
    // Create a SortedMap with predefined order key descending
    SortedMap<Integer,String> cityMap = new TreeMap<>( ci );

    // add few items and iterate over it 
    cityMap.put(12, "Alexandria");
    cityMap.put(5, "Arlington");
    cityMap.put(77, "FallsChurch");
    cityMap.put(3, "Fairfax");
    
    System.out.println( cityMap );
    
    
    
    // Map is not Iterable 
    // In order to iterate mapObject we need to get collection view
    // map.keySet()   map.values()  map.entrySet()
    
//    for (Entry<Integer,String> each: cityMap.entrySet()){
//      System.out.println(each.getValue());
//      System.out.println(each.getKey());
//    }

  }

}

class KeyReverseComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    
    return  o2 - o1 ;  
  }
  
}

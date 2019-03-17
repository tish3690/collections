package collectionday3;

import java.util.*;
import java.util.Map.Entry;

public class SortedMapPractice2 {

  public static void main(String[] args) {
    
    
    HashMap<Integer,String> cityMap = new HashMap<>();
    // add few items and iterate over it 
    cityMap.put(22304, "Alexandria");
    cityMap.put(22384, "Arlington");
    cityMap.put(26304, "FallsChurch");
    cityMap.put(25504, "Fairfax");
    
    //3 view of MAP OBJECT
    //**********************
    Set<Integer> keyView = cityMap.keySet();
    Collection <String> valueView = cityMap.values();
    Set<Entry<Integer,String>> entryView = cityMap.entrySet();
    //**********************
    
    for (Integer key: cityMap.keySet()) {
      
      System.out.println("Map key : "+ key);
    }
    
    for (String each : cityMap.values()) {
      System.out.println("Map value "+ each);
    }
    
    for(  Entry<Integer, String> eachEntry : cityMap.entrySet()) {
      System.out.println( eachEntry.getKey() + "--" + eachEntry.getValue()  );
    }
    
    
    // Map is not Iterable 
    // In order to iterate mapObject we need to get collection view
    // map.keySet()   map.values()  map.entrySet()
    
//    for (Entry<Integer,String> each: cityMap.entrySet()){
//      System.out.println(each.getValue());
//      System.out.println(each.getKey());
//    }
    
    //SortedMap<Integer,String> cityMap = new TreeMap<>();
    
    }

}
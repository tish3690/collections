package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	
	public static void main(String[] args) {
		
		//Creating a HashMap
		
		//1. Creating HashMap with default initial capacity and load factor
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
         
        //2. Creating HashMap with 30 as initial capacity 
        HashMap<String, Integer> map2 = new HashMap<String, Integer>(30);
         
        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);
         
        //4. Creating HashMap by copying another HashMap 
        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);
		
        /******************************************************************/
        
	//Creating HashMap with default initial capacity and load factor
        HashMap<String, Integer> map = new HashMap<String, Integer>();
         
    //Inserting key-value pairs to map using put() method
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);
         
    //Printing key-value pairs 
         
        Set<Entry<String, Integer>> entrySet = map.entrySet();
         
        for (Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         
        System.out.println("-------------------------");
         
    //Creating another HashMap
         
        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();
         
    //Inserting key-value pairs to anotherMap using put() method
        anotherMap.put("SIX", 6);
        anotherMap.put("SEVEN", 7);
         
    //Inserting key-value pairs of map to anotherMap using putAll() method
         
        anotherMap.putAll(map);
         
    //Printing key-value pairs of anotherMap
         
        entrySet = anotherMap.entrySet();
         
        for (Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("-------------------------");
        
        
    //Adds key-value pair 'ONE-111' only if it is not present in map
        map.putIfAbsent("ONE", 111);
         
    //Adds key-value pair 'FIVE-5' only if it is not present in map
        map.putIfAbsent("TEN", 10);
         
    //Printing key-value pairs of map
        Set<Entry<String, Integer>> entrySet2 = map.entrySet();
                 
        for (Entry<String, Integer> entry : entrySet2){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("---------------------------");
        
    //Retrieving a value associated with key 'TWO'
        int value = map.get("TWO");
        System.out.println(value);       //Output : 2
        
        System.out.println("------------------------------");
        
    //Checking whether key '3' exist in map
        System.out.println(map.containsKey("THREE"));      //Output : true
         
    //Checking whether value '3.3' exist in map
        System.out.println(map.containsValue(3));   //Output : true
        
        System.out.println("----------------------------");
        
    //Retrieving the number of key-value pairs present in map
        System.out.println(map.size());      //Output : 6
        
        System.out.println("----------------------------");
        
    //Retrieving the Key Set
        Set<String> keySet = map.keySet();
         
        for (String key : keySet){
            System.out.println(key);
        }
        
        System.out.println("-------------------------");
        
    //Retrieving the Collection view of values present in map
        Collection<Integer> values = map.values();
         
        for (Integer eachValue : values){
            System.out.println(eachValue);
        }
        
        System.out.println("------------------------");
        
    //Removing the mapping for the key 'ONE'
        map.remove("ONE");
        
        Set<Entry<String, Integer>> entrySet3 = map.entrySet();
        
        for (Entry<String, Integer> entry : entrySet3){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------------");
        
    //Removes the mapping for the key 'TWO' only if it is currently mapped to 2
        map.remove("TWO", 2);  //removes
         
    //Removes the mapping for the key 'TEN' only if it is currently mapped to 11
        map.remove("TEN", 11);  //does NOT remove, as "TEN" is mapped to 10
        
        Set<Entry<String, Integer>> entrySet4 = map.entrySet();
        
        for (Entry<String, Integer> entry : entrySet4){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------------");
        
    //Replacing the value associated with 'FOUR' to 444
        map.replace("FOUR", 444);
        
        Set<Entry<String, Integer>> entrySet5 = map.entrySet();
        
        for (Entry<String, Integer> entry : entrySet5){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------------");
        
        
    //Replacing the value associated with 'FOUR' to 4 only if it is currently mapped to 444
        map.replace("FOUR", 444, 4);
		
        Set<Entry<String, Integer>> entrySet6 = map.entrySet();
        
        for (Entry<String, Integer> entry : entrySet6){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------------");
        
    //Getting synchronized Map
        
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);
        
        Set<Entry<String, Integer>> entrySetSync = syncMap.entrySet();
        
        for(Entry<String, Integer> entry : entrySetSync) {
        	System.out.println(entry.getKey()+" : "+entry.getValue());
        }
		
		
	}

}

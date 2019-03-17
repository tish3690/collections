package cf;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTest {

  public static void main(String[] args) {
    
    
    String str = "ABCBSDHFD  SGFODFGJKQJORGW HJSDGFJSAHSKJDHSDJ FGHHJSD" ; 
    // Task : 
    //  create a frequency table using Map 
    Map<Character, Integer> table = new HashMap<>();
    
    for (int i = 0; i < str.length(); i++) {
      
      Character c = str.charAt(i);
      
      if( ! table.containsKey(c)) {
        table.put(c, 1);
      } else{
        table.put(c, table.get(c) + 1); 
      }
    
    } 
    
    System.out.println(table);
    
    
    

  }

}

package cf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OtherConstructors {

  public static void main(String[] args) {
    
    
    List<String> ls = new ArrayList<>();
    ls.add("abc");
    ls.add("abc");
    ls.add("efg");
    
    List<String> ls2 = new ArrayList<>(ls) ; 
    
    System.out.println(ls2);
    
    //Set<String> set1 = new HashSet<>( ls ); 
    
    Set<String> set2 = new HashSet<>( ); 
    
    for (int i = 0; i < ls.size(); i++) {
      set2.add(  ls.get(i)   ) ; 
    }
    
    
    System.out.println( set2 );
    
    

  }

}

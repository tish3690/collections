package cf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BulkCollectionOperation {

  public static void main(String[] args) {
    
    Collection<String> ls = new ArrayList<>();
    ls.add("Hello");
    ls.add("Bye");

    
    ArrayList<String> ls1 = new ArrayList<>();
    ls.addAll(ls1);
    System.out.println(ls);
    
    ls.removeAll(ls1);
    System.out.println(ls1);
    
    List<String> ls2 =  Arrays.asList("aaa","Hello", "bbb") ;   ///new ArrayList<>();
    System.out.println(ls);
    ls.retainAll( ls2 ) ; //prints out the elements BOTH lists have, gets the common part
    System.out.println( ls );
    
    
    //    
//    
//    
//    
//    
//    
//    
//    ls1.removeAll(ls2);
//
//    Collection<String> ls3 = new ArrayList<>();
//      ls.retainAll(ls1);
//      ls1.retainAll(ls3);
//      //System.out.println(str + "\n" + str1 + "\n" + str2);
//    
//    

  }

}

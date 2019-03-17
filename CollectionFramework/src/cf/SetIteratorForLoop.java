package cf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorForLoop {

  public static void main(String[] args) {

    Set<Integer> numSets = new HashSet<>();

    // HashSet<Integer> numSets2 = new HashSet<>();
    numSets.add(123);
    numSets.add(121);
    numSets.add(12);
    numSets.add(123);
    numSets.add(124);
    

    
    for(Iterator<Integer> setIter = numSets.iterator();  setIter.hasNext() ;   ) {
      
      System.out.println(  setIter.next() );
      
    }
    

  }

}

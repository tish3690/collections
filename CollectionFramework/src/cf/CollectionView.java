package cf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionView {

  public static void main(String[] args) {
    List<Long> longList = new ArrayList<>();
    longList.add(1088L);
    longList.add(100L);
    longList.add(102L);
    longList.add(100L);
    longList.add(103L);
    longList.add(103L);
    longList.add(104L);
    longList.add(105L);
    longList.add(100L);

    SortedSet<Long> sSet = new TreeSet<>(longList);
    System.out.println( sSet );
  
    SortedSet<Long> tail = sSet.tailSet(104L) ;
    System.out.println(tail);
    tail.remove(105L); 
    System.out.println(sSet );
    System.out.println(tail);
    
    

  }

}

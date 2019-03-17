package collectionday3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {

  public static void main(String[] args) {
    
   List<String> names = Arrays.asList("Adam","Zain","Bob","Dave","Bob") ; 
   
   Collections.sort(names);
   
   //System.out.println(names);
   
   System.out.println( new Person("Adam", 22) );
   
   List<Person> people = new ArrayList<>();
     people.add(new Person("Adam", 22));
     people.add(new Person("Dave", 62));
     people.add(new Person("Dave", 30));
     people.add(new Person("Zain", 32));
     people.add(new Person("Bob", 42));
  
     Collections.sort(people);  //uses overridden compareTo method
     
     System.out.println(people);
     
//     String s1 = "A" ; 
//     String s2 = "B" ; 
//     String s3 = "C" ; 
//     
//     System.out.println(  s1.compareTo(s2)  );
//     System.out.println(  s1.compareTo(s3)  );
     
  
  //
  
  
   
   
    

  }

}
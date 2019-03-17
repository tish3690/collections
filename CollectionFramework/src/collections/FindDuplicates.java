package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		String[] strArr = {"Adam", "Steve", "Adam", "Bob", "Dave", "Bob"};
		
		//Method 1
		
		Set<String> distinctWords = Arrays.asList(strArr).stream().collect(Collectors.toSet()); 
		        System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
		        
		//Method 2
		        
		Set<String> s = new HashSet<String>();
		
		for (String a : strArr)
		        s.add(a);
		               
		System.out.println(s.size() + " distinct words: " + s);
		
		//Uniques and Duplicates
		
		Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : strArr)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
        
        //symmetric set difference - unique elements of both lists
        
        List<String> s1 = new ArrayList<>();
        s1.add("Adam");
        s1.add("Steve");
        s1.add("Mark");
        s1.add("Bob");
        
        List<String> s2 = new ArrayList<>();
        s2.add("Adam");
        s2.add("Bob");
        s2.add("Dave");
        s2.add("John");
        
        Set<String> symmetricDiff = new HashSet<String>(s1);
        symmetricDiff.addAll(s2);
        
        Set<String> tmp = new HashSet<String>(s1);
        tmp.retainAll(s2);
        symmetricDiff.removeAll(tmp);
        
        System.out.println(symmetricDiff);
		
	}

}

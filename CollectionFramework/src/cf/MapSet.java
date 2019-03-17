package cf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapSet {
	
	public static void main(String[] args) {
		
		List<Long> longList = new ArrayList<>();
		longList.add(1088L);
		longList.add(101L);
		longList.add(102L);
		longList.add(100L);
		longList.add(103L);
		longList.add(103L);
		longList.add(104L);
		longList.add(105L);
		longList.add(100L);
		System.out.println("longList size: " + longList.size());
		
		System.out.println(longList);
		
		Set<Long> longSet = new HashSet<>();
		
		for(Long each : longList) {
			longSet.add(each);
			
		}
		
		System.out.println(longSet);
		
		SortedSet<Long> sSet = new TreeSet<>(longSet);
		System.out.println(sSet);
		
		System.out.println(sSet.subSet(102L, 105L));
		System.out.println(sSet.tailSet(104L));
		System.out.println(sSet.headSet(103L));
		
		SortedSet<Long> tail = sSet.tailSet(104L);
		
		
	}

}

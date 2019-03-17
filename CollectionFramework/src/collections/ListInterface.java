package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(111);
		list1.add(222);
		list1.add(333);
		list1.add(444);
		
		List<Integer> list2 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		
		List<Integer> list3 = new ArrayList<>(list2);
		list3.addAll(list1);
		
		System.out.println(list3);
		
		List<Integer> list = new ArrayList<Integer>();
        for (Integer a : list3)
            list.add(a);
        Collections.shuffle(list, new Random());
        //Randomly permute the specified list using the specified source of randomness. 
        //All permutations occur with equal likelihood assuming that the source of randomness is fair.
        System.out.println(list);
        
        /*
sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
shuffle — randomly permutes the elements in a List.
reverse — reverses the order of the elements in a List.
rotate — rotates all the elements in a List by a specified distance.
swap — swaps the elements at specified positions in a List.
replaceAll — replaces all occurrences of one specified value with another.
fill — overwrites every element in a List with the specified value.
copy — copies the source List into the destination List.
binarySearch — searches for an element in an ordered List using the binary search algorithm.
indexOfSubList — returns the index of the first sublist of one List that is equal to another.
lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
         */
		
		
	}

}

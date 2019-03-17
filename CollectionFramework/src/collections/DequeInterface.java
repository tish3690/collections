package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {
	
	//A double-ended-queue is a linear collection of elements 
	   //that supports the insertion and removal of elements at both end points
	
	//addFirst(), removeFirst(), getFirst() - throw exceptions   (Last())
	//offerFirst(), pollFirst(), peekFirst() - return null, false, null   (Last())
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedList<>();  //new ArrayDeque<>()
		
		deque.add(1);
		deque.add(1);
		deque.add(1);
		
		System.out.println(deque);
		
		deque.addFirst(2);  //throws an exception if it is full
		deque.addLast(2);
		System.out.println(deque);
		
		deque.offerFirst(3);  //=addFirst(), no exception if full
		deque.offerLast(4);
		System.out.println(deque);
		
		deque.offerFirst(56);  //=addFirst(), no exception if full
		deque.offerLast(78);
		System.out.println(deque);
		
		deque.pollFirst(); //=removeFirst();
		deque.pollLast();  
		System.out.println(deque);
		
		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
	}

}

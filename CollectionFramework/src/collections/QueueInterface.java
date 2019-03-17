package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueInterface {
	
	//A Queue is a collection for holding elements prior to processing
	//add(), remove(), element() - throw exceptions
	//offer(), poll(), peek() - return null, false, null
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int time = sc.nextInt();
		
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);
        
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());  //same as poll(), 
                                         //differs when empty. poll returns null, remove() throws NoSuchElementException
            Thread.sleep(1000);
        }
        
        sc.close();
        
        queue.add(122);  // same as offer(), when empty throws IllegalStateException
        queue.offer(25);  //when empty returns false
        queue.add(6);
        queue.add(87);
        queue.add(122);
        queue.add(1058);
        queue.add(1);
        queue.add(46);
        
        
        System.out.println(queue);
        
        System.out.println(queue.element());  //returns the head of the queue, when empty - NoSuchElementException
        System.out.println(queue.peek());  //when empty returns null
        
        
        //PriorityQueue is a class, not an interface. are ordered according to their natural ordering, 
        //or by a Comparator provided at queue construction time, depending on which constructor is used
        
        Queue<Integer> pq = new PriorityQueue<Integer>(queue);
        
        System.out.println(pq);
		
	}

}

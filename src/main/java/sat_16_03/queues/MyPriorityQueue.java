package sat_16_03.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {

	/**
	 * 	 Based on a priority heap !!!!!!
	 * 		We assign a priority value to every single items
	 * 
	 * 			- element with high priority is served before an element with low priority
	 * 
	 * 			~ the elements of the priority queue are ordered according to their natural ordering
	 * 					defined by the Comparable interface
	 * 
	 * add() -> add elements to the queue
	 * 
	 * peek() -> Retrieves, but does not remove, the head of this queue, 
	 * 				or returns null if this queue is empty.
	 * 
	 * poll() -> Retrieves and removes the head of this queue, or returns null if this queue is empty
	 * 
	 */
	
	public static void main(String[] args) {
		
		Queue<Person> queue = new PriorityQueue<>();
		
		queue.add(new Person("Kevin",22));
		queue.add(new Person("Joe",37));
		queue.add(new Person("Adam",12));
		queue.add(new Person("Anna",45));
		
		while( queue.peek() != null ) 
			System.out.println(queue.poll());
		
	}
}

package queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	/**
	 * 	Deque --> ArrayDeque is the implementation
	 * 
	 * 		deque: "doubly-ended queue"
	 * 
	 * 			We can insert and remove from both sides of the queue
	 * 
	 * 				offerFirst(T t) and offerLast(T t)
	 * 				removeFirst() and removeLast()
	 * 
	 * 				+ it is not thread safe
	 * 				+ it allows unlimited insertion of items
	 * 				+ ArrayDeque can be used as queue and stack both 
	 * 						When it is used as stack, it is faster than stack and 
	 * 								when it is used as queue, it is faster than linkedList !!!
	 * 
	 */
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.offerFirst(10);
		deque.offerLast(20);
		deque.offerFirst(30);
		deque.offerLast(40);
		
		deque.removeLast();
		
		for(Integer i : deque)
			System.out.println(i);
		
	}
}

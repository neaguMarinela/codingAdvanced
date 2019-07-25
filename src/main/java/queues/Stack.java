package queues;

public class Stack {

	/**
	 * 	A Stack is a data structure where you add elements to the "top" of the stack,
	 * 		 and also remove elements from the top again
	 * 
	 * 			Last In First Out (LIFO) principle
	 * 
	 * 				- Stack's are really good for some types of data processing	
	 * 					For instance if you are parsing an XML file using either SAX or StAX
	 * 
	 * 		push() method pushes an object onto the top of the Stack
	 * 
	 * 		peek() method returns the object at the top of the Stack, but does not
	 * 					remove object
	 * 
	 * 		pop() method returns the object at the top of the stack,
	 * 				 and removes the object from the Stack
	 * 
	 * 		Applications --> for example graph traversing with depth-first search !!!
	 * 
	 */
	
	public static void main(String[] args) {
		
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		for(Integer i : stack)
			System.out.println(i);

		System.out.println(stack.pop());
		System.out.println(stack);

	}
}

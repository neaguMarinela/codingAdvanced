package exceptionsDemo.exceptiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ConcurrentModificationException is thrown when you try to modify the list in for( Type obj : list ) syntax or using itertator.next() with Collection
 * 
 *
 */
public class ConCurrModificationExceptionDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		for( Integer i : list ) {
		    list.remove(i);
		}
	}
}

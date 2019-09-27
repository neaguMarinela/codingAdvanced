package colections.solutions.jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unmodifiable {

	public static void main(String[] args) {
		List<String> stuff = Arrays.asList(new String[] { "a", "b" });

	    List list = new ArrayList<String>(stuff);
	    list = Collections.unmodifiableList(list);

	    // Collections.unmodifiableSet(set);
	    try {
	      list.set(0, "new value");
	    } catch (UnsupportedOperationException e) {
	      System.out.println(e);  
	    }
	}

}

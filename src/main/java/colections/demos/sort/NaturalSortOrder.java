package colections.demos.sort;

import java.util.Arrays;

/**
 * NaturalSortOrder using Comparable
 *
 */
public class NaturalSortOrder {

	private Employee employeesToSort[];

	public void initEmployees() {
		employeesToSort = new Employee[] { 
				new Employee("Mary", 21, 65000.0), 
				new Employee("Danny", 19, 65000.0),
				new Employee("John", 32, 65000.0) };
	}

	public void sortEmployees() {
		Arrays.sort(employeesToSort); // sorts and returns void
	}

	public void printEmployees() {
		System.out.println(Arrays.toString(employeesToSort));
	}

	public static void main(String[] args) {
		NaturalSortOrder nso = new NaturalSortOrder();

		nso.initEmployees();

		nso.sortEmployees();

		nso.printEmployees();
	}
}

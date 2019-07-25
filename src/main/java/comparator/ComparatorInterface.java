package comparator;

import java.util.Comparator;

public class ComparatorInterface {
    public static void main(String[] args) {

        Employee mike = new Employee("Mike", 2000);
        Employee louise = new Employee("Louise", 2500);

        /*Comparator<Employee> byNameWithoutLambda = new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                return a.getName().compareTo(b.getName());
            }
        };

        System.out.println("By name without lambda:" + byNameWithoutLambda.compare(mike, louise));*/

        //Comparator<comparator.Employee> byName = (a, b) -> a.getName().compareTo(b.getName());
        //sau
        //Comparator<comparator.Employee> byNameLambda1 = (comparator.Employee a, comparator.Employee b) -> { return a.getName().compareTo(b.getName()); };
        //sau
        //Comparator<comparator.Employee> byNameLambda2 = (a, b) -> {	return a.getName().compareTo(b.getName()); };
        //sau
        //Comparator<comparator.Employee> byNameLambda3 = (a, b) -> a.getName().compareTo(b.getName());

        Comparator<Employee> byName = Comparator.comparing(Employee::getName);
        //System.out.println("By name:" + byName.compare(mike, louise));

        //System.out.println("Will throw NPE:" + byName.compare(mike, null));

        try {
            // throws NPE
            //System.out.println("Will throw NPE:" + byName.compare(mike, null));
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }
}
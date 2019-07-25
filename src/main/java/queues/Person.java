package queues;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person: " + this.name + "-" + this.age;
	}

	@Override
	public int compareTo(Person otherPerson) {
		return -this.name.compareTo(otherPerson.getName());
	}
}

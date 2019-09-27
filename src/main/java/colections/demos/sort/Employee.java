package colections.demos.sort;

class Employee implements Comparable {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Employee) obj).getName().equals(getName());
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return getName().compareTo(e.getName());
	}

	@Override
	public String toString() {
		StringBuilder strBld = new StringBuilder();
		strBld.append("\nname: " + name);
		strBld.append("\nage: " + age);
		strBld.append("\nsalary: " + salary);
		return strBld.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
package localInstanceVariables;

public class Student {

	public static int NUMBER = 122;
	
	private int age;
	private String name;
	
	public Student() {
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void calculate() {
		int numberOfFriends = age * 2;
		
		System.out.println("Num of friends: " + numberOfFriends);
	}
}

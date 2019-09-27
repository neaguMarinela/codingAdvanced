package colections.demos.jcf;

public class ObjectMatch {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setRoll_Id(1);
		stud1.setFirstName("John");
		stud1.setLastName("Doe");
		stud1.setPhoneNumber("111-000-2121");

		Student stud2 = new Student();
		stud2.setRoll_Id(1);
		stud2.setFirstName("John");
		stud2.setLastName("Doe");
		stud2.setPhoneNumber("111-000-2121");

		Student stud3 = new Student();
		stud3.setRoll_Id(1);
		stud3.setFirstName("John");
		stud3.setLastName("Doe");
		stud3.setPhoneNumber("111-000-2121");

		if (stud1.equals(stud3)) {
			System.out.println(true);
		}

		System.out.println(stud3);
	}
}

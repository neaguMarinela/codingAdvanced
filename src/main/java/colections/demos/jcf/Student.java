package colections.demos.jcf;

public class Student {

	private Integer roll_Id;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Integer getRoll_Id() {
		return roll_Id;
	}

	public void setRoll_Id(Integer roll_Id) {
		this.roll_Id = roll_Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	// override equals method
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student studentObj = (Student) obj;
			if (this.getRoll_Id().equals(studentObj.getRoll_Id())
					&& this.getFirstName().equals(studentObj.getFirstName())
					&& this.getLastName().equals(studentObj.getLastName())
					&& this.getPhoneNumber().equals(studentObj.getPhoneNumber())) {
				System.out.println("matches: return true");
				return true;
			}
		}
		System.out.println("does not match: return false");
		return false;
	}

	@Override
	public String toString() {
		StringBuilder strBld = new StringBuilder();
		strBld.append("roll_Id: " + roll_Id);
		strBld.append("\nfirstName: " + firstName);
		strBld.append("\nlastName: " + lastName);
		strBld.append("\nphoneNumber: " + phoneNumber);

		return strBld.toString();
	}

}

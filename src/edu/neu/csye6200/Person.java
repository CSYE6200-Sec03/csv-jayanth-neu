package edu.neu.csye6200;

public class Person {
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String parentFirstName;
	private String parentLastName;
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public Person(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}

	@Override
	public String toString() {
		return ", id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", parentFirstName=" + parentFirstName + ", parentLastName=" + parentLastName + "]";
	}
	
}

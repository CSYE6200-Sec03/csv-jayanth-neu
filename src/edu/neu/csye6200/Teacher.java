package edu.neu.csye6200;

public class Teacher extends Person{
	private double hourlyWage;

	public double getHourlyWage() {
		return hourlyWage;
	}

	public Teacher(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			double hourlyWage) {
		super(id, age, firstName, lastName, parentFirstName, parentLastName);
		this.hourlyWage = hourlyWage;
	}

	public static Teacher parseStringToTeacher(String stringData) {
		String[] stData = stringData.split(",");
		Teacher st = new Teacher(Integer.parseInt(stData[0])
									,Integer.parseInt(stData[1])
									,stData[2]
									,stData[3]
									,stData[4]
									,stData[5]
									,Double.parseDouble(stData[6]));
		return st;		
	}

	@Override
	public String toString() {
		return "Teacher [hourlyWage=" + hourlyWage + super.toString();
	}

}

package edu.neu.csye6200;

public class Student extends Person implements Comparable<Student>{
	private int studentId;
	private double gpa;
	
	public int getStudentId() {
		return studentId;
	}

	public double getGpa() {
		return gpa;
	}

	public Student(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName,
			int studentId, double gpa) {
		super(id, age, firstName, lastName, parentFirstName, parentLastName);
		this.studentId = studentId;
		this.gpa = gpa;
	}
	
	public static Student parseStringToStudent(String stringData) {
		String[] stData = stringData.split(",");
		Student st = new Student(Integer.parseInt(stData[0])
									,Integer.parseInt(stData[1])
									,stData[2]
									,stData[3]
									,stData[4]
									,stData[5]
									,Integer.parseInt(stData[6])
									,Double.parseDouble(stData[7]));
		return st;		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", gpa=" + gpa + super.toString();
	}
	
    public static int compareByStudentId(Student s1, Student s2){
        return Integer.compare(s1.getStudentId(), s2.getStudentId());
    }
    
    public static int compareByGpa(Student s1, Student s2){
        return Double.compare(s1.getGpa(), s2.getGpa());
    }

    public static int compareByFirstName(Student s1, Student s2){
        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
    }

    public static int compareByLastName(Student s1, Student s2){
        return s1.getLastName().compareToIgnoreCase(s2.getLastName());
    }
    
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getId(), o.getId());
    }
    
    public static String ToCsvFormat(Student s){
        return s.getId() + "," + s.getAge() + "," + s.getFirstName() + "," + s.getLastName() + "," +
                s.getParentFirstName() + "," + s.getParentLastName() + "," + s.getStudentId() + "," + s.getGpa();
    }    
	
}

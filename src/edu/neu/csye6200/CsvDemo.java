package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class CsvDemo {

	public static void demo() {
		
		//Reading a CSV file and creating Student Object
		String inputStudentFilePath = "src/edu/neu/csye6200/students.txt";
		List<Student> stObjects = new ArrayList<>();
		for(String str : FileUtil.readCsv(inputStudentFilePath)) 
			stObjects.add(Student.parseStringToStudent(str));
		
		//Displaying all the Students
		
		System.out.println("**Students Data**\n");
		printStudentList(stObjects);
		
		//Reading a CSV file and creating Student Object
		String inputTeacherFilePath = "src/edu/neu/csye6200/teachers.txt";
		List<Teacher> tObjects = new ArrayList<>();
		for(String str : FileUtil.readCsv(inputTeacherFilePath)) 
			tObjects.add(Teacher.parseStringToTeacher(str));	
		
		//Displaying all the Teachers
		System.out.println("\n\n**Teachers Data**\n");
		for(Teacher t:tObjects) System.out.println(t);
		
		System.out.println("\n\n***************************************************************************\n");
		
		//Sorting Students List on various parameters
		
	    System.out.println("\n*Students Data after sorting by ID*\n");
	    stObjects.sort(null);
        printStudentList(stObjects);

        System.out.println("\n\n*Students Data after sorting by StudentId*\n");
        stObjects.sort(Student::compareByStudentId);
        printStudentList(stObjects);

        System.out.println("\n\n*Students Data after sorting by LastName*\n");
        stObjects.sort(Student::compareByLastName);
        printStudentList(stObjects);
 
        System.out.println("\n\n*Students Data after sorting by FirstName*\n");
        stObjects.sort(Student::compareByFirstName);
        printStudentList(stObjects);
 
        System.out.println("\n\n*Students Data after sorting by GPA*\n");
        stObjects.sort(Student::compareByGpa);
        printStudentList(stObjects);
        
        //Writing Students objects into a File
        String outputStudentFilePath = "src/edu/neu/csye6200/studentsOutput.txt";
        String tempString = "";
        List<String> studentsCsv = new ArrayList<>();
        for (Student student : stObjects){
            tempString = Student.ToCsvFormat(student);
            studentsCsv.add(tempString);
        }
        FileUtil.writeCsv(outputStudentFilePath, studentsCsv); 
        System.out.println("\n\n********Written Student objects into a local folder********");     
	}
	
    public static void printStudentList(List<Student> students){
        for(Student student : students){
            System.out.println(student);
        }	
    }
}

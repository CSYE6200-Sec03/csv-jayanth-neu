package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsvDemo.demo();

	}
}

/*
CONSOLE OUTPUT

**Students Data**

Student [studentId=1510, gpa=3.1, id=12, age=23, firstName=nithin, lastName=reddy, parentFirstName=Alia, parentLastName=Bhatt]
Student [studentId=1310, gpa=2.9, id=14, age=19, firstName=nani, lastName=rao, parentFirstName=Salman, parentLastName=Khan]
Student [studentId=2010, gpa=3.3, id=11, age=24, firstName=arjun, lastName=naidu, parentFirstName=Samantha, parentLastName=Prabhu]
Student [studentId=2221, gpa=2.5, id=13, age=22, firstName=charan, lastName=setty, parentFirstName=Brahmi, parentLastName=John]


**Teachers Data**

Teacher [hourlyWage=30.05, id=22, age=35, firstName=aamir, lastName=khan, parentFirstName=salman, parentLastName=datt]


***************************************************************************


*Students Data after sorting by ID*

Student [studentId=2010, gpa=3.3, id=11, age=24, firstName=arjun, lastName=naidu, parentFirstName=Samantha, parentLastName=Prabhu]
Student [studentId=1510, gpa=3.1, id=12, age=23, firstName=nithin, lastName=reddy, parentFirstName=Alia, parentLastName=Bhatt]
Student [studentId=2221, gpa=2.5, id=13, age=22, firstName=charan, lastName=setty, parentFirstName=Brahmi, parentLastName=John]
Student [studentId=1310, gpa=2.9, id=14, age=19, firstName=nani, lastName=rao, parentFirstName=Salman, parentLastName=Khan]


*Students Data after sorting by StudentId*

Student [studentId=1310, gpa=2.9, id=14, age=19, firstName=nani, lastName=rao, parentFirstName=Salman, parentLastName=Khan]
Student [studentId=1510, gpa=3.1, id=12, age=23, firstName=nithin, lastName=reddy, parentFirstName=Alia, parentLastName=Bhatt]
Student [studentId=2010, gpa=3.3, id=11, age=24, firstName=arjun, lastName=naidu, parentFirstName=Samantha, parentLastName=Prabhu]
Student [studentId=2221, gpa=2.5, id=13, age=22, firstName=charan, lastName=setty, parentFirstName=Brahmi, parentLastName=John]


*Students Data after sorting by LastName*

Student [studentId=2010, gpa=3.3, id=11, age=24, firstName=arjun, lastName=naidu, parentFirstName=Samantha, parentLastName=Prabhu]
Student [studentId=1310, gpa=2.9, id=14, age=19, firstName=nani, lastName=rao, parentFirstName=Salman, parentLastName=Khan]
Student [studentId=1510, gpa=3.1, id=12, age=23, firstName=nithin, lastName=reddy, parentFirstName=Alia, parentLastName=Bhatt]
Student [studentId=2221, gpa=2.5, id=13, age=22, firstName=charan, lastName=setty, parentFirstName=Brahmi, parentLastName=John]


*Students Data after sorting by FirstName*

Student [studentId=2010, gpa=3.3, id=11, age=24, firstName=arjun, lastName=naidu, parentFirstName=Samantha, parentLastName=Prabhu]
Student [studentId=2221, gpa=2.5, id=13, age=22, firstName=charan, lastName=setty, parentFirstName=Brahmi, parentLastName=John]
Student [studentId=1310, gpa=2.9, id=14, age=19, firstName=nani, lastName=rao, parentFirstName=Salman, parentLastName=Khan]
Student [studentId=1510, gpa=3.1, id=12, age=23, firstName=nithin, lastName=reddy, parentFirstName=Alia, parentLastName=Bhatt]


*Students Data after sorting by GPA*

Student [studentId=2221, gpa=2.5, id=13, age=22, firstName=charan, lastName=setty, parentFirstName=Brahmi, parentLastName=John]
Student [studentId=1310, gpa=2.9, id=14, age=19, firstName=nani, lastName=rao, parentFirstName=Salman, parentLastName=Khan]
Student [studentId=1510, gpa=3.1, id=12, age=23, firstName=nithin, lastName=reddy, parentFirstName=Alia, parentLastName=Bhatt]
Student [studentId=2010, gpa=3.3, id=11, age=24, firstName=arjun, lastName=naidu, parentFirstName=Samantha, parentLastName=Prabhu]


********Written Student objects into a local folder********

*/

package comparing_objects;

public class StudentsCustom{
//declaring some variables to store student details.
	int roll;
	String name;
	Double marks;

	//Creating a constructor to initialize the variables.
	public StudentsCustom(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	//Overriding the toString method to return the actual content. 
	@Override
	public String toString() {
		return "Student with roll number " + roll + " is " + name + " and has marks " + marks;
	}	
}

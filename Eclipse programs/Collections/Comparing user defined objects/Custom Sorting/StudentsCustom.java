package comparing_objects;

public class StudentsCustom{

	int roll;
	String name;
	Double marks;
	
	public StudentsCustom(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student with roll number " + roll + " is " + name + " and has marks " + marks;
	}
	
	
	
	
}

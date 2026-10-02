package comparing_objects;
//To compare user-defined objects we need to override the compareTo method in the class,
//whose objects have to be compared. 
//For default sorting we need to import the Comparable interface and Override the compareTo method.
public class Student implements Comparable<Student>{

	//declaring some variables to initialize via constructor.
	int age;
	int roll;
	String name;

	//Creating a constructor to initialize the variables.
	public Student(int age, int roll, String name) {
		
		this.age = age;
		this.roll = roll;
		this.name = name;
	}

	//Overriding the toString method so that we get the actual content instead of Strong representation.
	@Override
	public String toString() {
		return "Student [age=" + age + ", roll=" + roll + ", name=" + name + "]";
	}
	
	//Overriding the compareTo method with customized logic to compare and sort objects of Student class 
	@Override
	public int compareTo(Student s) {
		return this.age - s.age;
	}
	
}

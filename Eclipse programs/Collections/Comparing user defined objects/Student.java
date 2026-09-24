package comparing_objects;

public class Student implements Comparable<Student>{

	int age;
	int roll;
	String name;
	
	public Student(int age, int roll, String name) {
		
		this.age = age;
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", roll=" + roll + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student s) {
		return this.age - s.age;
	}
	
}

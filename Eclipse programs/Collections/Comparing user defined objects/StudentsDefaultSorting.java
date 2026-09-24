package comparing_objects;

import java.util.TreeSet;

public class StudentsDefaultSorting {

	public static void main(String[] args) {
		
		Student s1 = new Student(19, 101, "Mikasa");
		Student s2 = new Student(20, 102, "Eren");
		Student s3 = new Student(23, 103, "Jean");
		Student s4 = new Student(25, 104, "Armin");
		Student s5 = new Student(22, 105, "Annie");
		Student s6 = new Student(21, 106, "Connie");
		
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		
		ts.add(s1);
		ts.add(s2);
		
		for(Student s : ts) {
			System.out.println(s);
		}
		
	}
}

package comparing_objects;

import java.util.TreeSet;

public class StudentsDefaultSorting {

	public static void main(String[] args) {
		//Creating objects of Student class that need to be compared.
		Student s1 = new Student(19, 101, "Mikasa");
		Student s2 = new Student(20, 102, "Eren");
		Student s3 = new Student(23, 103, "Jean");
		Student s4 = new Student(25, 104, "Armin");
		Student s5 = new Student(22, 105, "Annie");
		Student s6 = new Student(21, 106, "Connie");

		//Creating a TreeSet to store, compare and sort the Student objects.
		//When we store objects in a TreeSet it looks for compareTo method in that class. 
		//It looks for compareTo method in the specific wrapper class(Integer, Double, String, Character) of that 
		//particular datatype. 
		//But for user-defined objects the TreeSet will look for compareTo method in that class. hence we 
		//have to override the compareTo method in the class otherwise we will get ClassCastException in absence of 
		//compareTo method logic. 
		TreeSet<Student> ts = new TreeSet<Student>();

		//adding the obbects to the TreeSet.
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		//Duplicate obbets will not be added.
		ts.add(s1);
		ts.add(s2);

		//for each loop to traverse through the TreeSet.
		for(Student s : ts) {
			System.out.println(s); //this will call the toString method which is oberriden to show actual content.
		}
		
	}
}

package comparing_objects;

import java.util.Scanner; //importing Scanner to accept user inputs.
import java.util.TreeSet; //importing TreeSet class to sort the objects.

public class StudentsCustom2 {

	public static void main(String[] args) {
		//Accepting user inputs. 
		Scanner scan = new Scanner(System.in);
		//Prompt asking user to input. 
		System.out.println("How do you want to sort the Students?\n1)By Roll no. 2)By Name 3)By Marks");
		//storing user input.
		int choice = scan.nextInt();
		//Closed Scanner method.
		scan.close();

		//Created objects of the class to invoke the constructor and initialize the variables.
		StudentsCustom s1 = new StudentsCustom(1, "Sasha", 45.56);
		StudentsCustom s2 = new StudentsCustom(3, "Jean", 50.34);
		StudentsCustom s3 = new StudentsCustom(2, "Flock", 44.35);
		StudentsCustom s4 = new StudentsCustom(5, "Gabi", 56.46);
		StudentsCustom s5 = new StudentsCustom(4, "Falco", 45.75);
		
		//switch-case statements to pass the object of a sorting class as per the user's choice, into the TreeSet object.
		switch (choice){
		case 1: //if user choice is 1 then a reference of SortStudentsByRoll class will be sent to the TreeSet so that it will sort the objects by roll number.
			SortStudentsByRoll SSBR = new SortStudentsByRoll();
			TreeSet<StudentsCustom> ts = new TreeSet<StudentsCustom>(SSBR);
			ts.add(s1); 
			ts.add(s2); 
			ts.add(s3); 
			ts.add(s4); 
			ts.add(s5); 
			ts.add(s1);

			//Printing the sorted objects by Roll number.
			for(StudentsCustom sc : ts) {
			System.out.println(sc);
		    }
			break;
			
		case 2: //if user choice is 2 then a reference of SortStudentsByName class will be sent to the TreeSet so that it will sort the objects by Name.
			SortStudentsByName SSBN = new SortStudentsByName();
			TreeSet<StudentsCustom> ts1 = new TreeSet<StudentsCustom>(SSBN);
			ts1.add(s1); 
			ts1.add(s2); 
			ts1.add(s3); 
			ts1.add(s4); 
			ts1.add(s5); 
			ts1.add(s1);
			
			//Printing the sorted objects by Name.
			for(StudentsCustom sc : ts1) {
			System.out.println(sc);
		    }
			break;
			
		case 3: //if user choice is 3 then a reference of SortStudentsByMarks class will be sent to the TreeSet so that it will sort the objects by Marks.
			SortStudentsByMarks SSBM = new SortStudentsByMarks();
			TreeSet<StudentsCustom> ts2 = new TreeSet<StudentsCustom>(SSBM);
			ts2.add(s1); 
			ts2.add(s2); 
			ts2.add(s3); 
			ts2.add(s4); 
			ts2.add(s5); 
			ts2.add(s1);
			
			//Printing the sorted objects by Marks.
			for(StudentsCustom sc : ts2) {
			System.out.println(sc);
		    }
			break;
			
			//Default case for invalid choice.
		default:
			System.out.println("Enter a valid choice");
	
		}

	}
}

package list;

import java.util.ArrayList;  //ArrayList is a pre-defined class in java.util package introduced from JDK 1.2.

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList Al = new ArrayList();  //Creating an ArrayList.

		//Adding objects to the ArrayList using add() method.
		Al.add(10);
		Al.add(20);
		Al.add(30);
		Al.add(40);
		Al.add(50);
		Al.add(60);
		
		System.out.println(Al);  //toString method is overridden in collection to print the actual content instead of String representation.

		//We can also use a for loop to trverse through the ArrayList Objects.
		for(int i = 0; i<Al.size(); i++) {
			System.out.println(Al.get(i));
		}
	}
}

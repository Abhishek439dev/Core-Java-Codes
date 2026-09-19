package list;
//importing the array list class to use it.
import java.util.ArrayList;

public class TestUserDefinedObjects {

	public static void main(String[] args) {
		//Creating the objects to initialize the variables via constructor.
		UserDefinedObjects emp1 = new UserDefinedObjects(101, "Tom", 5000.0);
		UserDefinedObjects emp2 = new UserDefinedObjects(102, "Mike", 4000.0);
		UserDefinedObjects emp3 = new UserDefinedObjects(103, "Shawn", 6000.0);
		UserDefinedObjects emp4 = new UserDefinedObjects(104, "Eren", 10000.0);

		//Creating an ArrayList to store the objects of UserDefinedObjects.
		ArrayList<UserDefinedObjects> al = new ArrayList<UserDefinedObjects> ();

		//Adding the objects into the ArrayList.
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);

		//Traversing through the objects stored in the ArrayList via ForEach loop.
		for(UserDefinedObjects obj : al) {
			System.out.println(obj);
		}
		
	}
}

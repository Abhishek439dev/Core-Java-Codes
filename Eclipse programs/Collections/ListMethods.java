package list;
//There are a number of methods in collection. List collections provide a number of methods to manipulate data.

//Imported the list collection classes.
import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {

	public static void main(String[] args) {
		//Creating an ArrayList.
		ArrayList al = new ArrayList();

		//Adding objects to the ArrayList.
		al.add(10);
		al.add("java");
		al.add(null);
		al.add(19.4);
		al.add(true);
		al.add(10);
		
		System.out.println(al);  //prints collection -> [10, java, null, 19.4, true, 10]
		
		System.out.println(al.size());  //Gives size of collection -> 6
		
		System.out.println(al.get(3));  //gets value at the particular index -> 19.4
		
		System.out.println(al.contains("Java")); //checks if the collection contains a particular object. -> false
		
		al.remove(2);  //removes the object from that index position.
		System.out.println(al);  // [10, java, 19.4, true, 10]
		
		System.out.println(al.isEmpty()); //checks if the collection is empty or not -> false.
		
		System.out.println(al);  //[10, java, 19.4, true, 10]
		System.out.println(al.indexOf(19.4));  //gets the index of that object. -> 2
		System.out.println(al.indexOf(20));  //gives -1 if the value is not present.
		
		System.out.println(al.indexOf(10));  //gives the first index value in case of duplicates. -> 0
		System.out.println(al.lastIndexOf(10)); //gives the last index in case of duplicates. -> 4
		
		al.clear();  //deletes all the objects from the collection.
		System.out.println(al);  // []
		
		System.out.println("--------------------");

		//Creating another ArrayList.
		ArrayList Al = new ArrayList(); 
		//Adding values.
		Al.add("java");
		Al.add(null);
		Al.add(19.4);
		Al.add(true);
		Al.add(10);

		//Creating a LinkedList.
		LinkedList ll = new LinkedList();
		
		ll.addAll(Al);  //adds the complete collection into another one in one go.
		System.out.println(ll); //[java, null, 19.4, true, 10]
		
		System.out.println("--------------------");

		System.out.println(Al);  //[java, null, 19.4, true, 10]
		//Adding some more values to the LinkedList.
		ll.add("SQL");
		ll.add(20);
		ll.add(false);
		System.out.println(ll); //[java, null, 19.4, true, 10, SQL, 20, false]
		System.out.println(ll.containsAll(Al)); //checks if one collection contains another collection completely -> true
		
		System.out.println("--------------------");
		
		System.out.println(Al); //[java, null, 19.4, true, 10]
		Al.add(2, 10.5); //Adds an object at a specified index position.
		System.out.println(Al); //[java, null, 10.5, 19.4, true, 10]
		
		System.out.println("--------------------");
		
		System.out.println(Al); //[java, null, 10.5, 19.4, true, 10]
		Al.set(4, 30); //Overrides an object at a specified index position.
		System.out.println(Al);  //[java, null, 10.5, 19.4, 30, 10]
		
		System.out.println("--------------------");
		
		System.out.println(ll);  //[java, null, 19.4, true, 10, SQL, 20, false]
		System.out.println(Al);  //[java, null, 10.5, 19.4, 30, 10]
		ll.removeAll(Al);  //removes a collection completely from another.
		System.out.println(ll);  //[true, SQL, 20, false]

	}
}

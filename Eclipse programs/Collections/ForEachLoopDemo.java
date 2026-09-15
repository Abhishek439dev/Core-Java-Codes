package list;
//forEach loop or enhanced for loop is a more efficient way to traverse through a group of objects like array or collections.
//Importing classes to use the respective collections.
import java.util.ArrayList;
import java.util.LinkedList;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		//Using for each loop on array.
		int[] a = {10,20,30,40,50};
		//Syntax: for(common-datatype-for-all-objects reference-variable  :  reference-variable of the array/collection)
		for(int i : a) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		String[] fruits = {"Apple", "Banana", "Grapes"};
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("---------------");
		//Using for each loop in collections.
		ArrayList<Integer> Al = new ArrayList<Integer>();
		//Adding objects in the ArrayList.
		Al.add(10);
		Al.add(20);
		Al.add(30);
		Al.add(40);
		Al.add(50);
		Al.add(60);
		
		for(int num : Al) {
			System.out.println(num);
		}
		
		System.out.println("---------------");
		
		LinkedList ll = new LinkedList();
		ll.add(23);
		ll.add(true);
		ll.add(null);
		ll.add(30.45);
		ll.add("Apple");
		//As there are heterogenous objects, we can use Object class as a non-primitive data type because it is inherited by all the classes(wrapper classes as well).
		for(Object obj : ll) {
			System.out.println(obj);
		}
	}
}

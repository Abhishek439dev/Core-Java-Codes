package sets;

import java.util.TreeSet;
//A TreeSet maintains the sorted order or ascending order of the objects entered. Duplicates are not allowed and null values are also not allowed because they
//are required for comparison and sorting.
public class TreeSetDemo {

	public static void main(String[] args) {
		//Creating a TreeSet.
		TreeSet<Integer> t = new TreeSet<Integer>();

		//Adding integer values to the TreeSet.
		t.add(29);
		t.add(30);
		t.add(10);
		t.add(45);
		t.add(10);
		t.add(19);
		t.add(12);
		t.add(5);
		t.add(12);
		//Printing the TreeSet.
		System.out.println(t);

		//Creating another TreeSet.
		TreeSet<String> t1 = new TreeSet<String>();
		//Adding String values to the TreeSet t1.
		t1.add("Armin");
		t1.add("Levi");
		t1.add("Ervin");
		t1.add("Annie");
		t1.add("Eren");
		t1.add("Mikasa");
		t1.add("Connie");
		t1.add("Jean");
		t1.add("Hange");
		t1.add("Mikasa");
		t1.add("Eren");

		//Printing it.
		System.out.println(t1);
		
	}
}

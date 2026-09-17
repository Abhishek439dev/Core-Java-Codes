package constructors;

import java.util.LinkedList;

public class LinkedListConstrs {

	public static void main(String[] args) {
		//i) LinkedList() - Creates a default LinkedList.
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.add("Java");
		ll.add(10);
		ll.add(true);
		ll.add(129.22);
		ll.add('M');
		
		System.out.println(ll);

		//ii) LinkedList(Collection c) - It is used to create a LinkedLinked which gets its values from another collection.
		System.out.println("-----------------------");
		
		LinkedList<Object> ll2 = new LinkedList<Object>(ll);
		
		System.out.println(ll2);
		
	}
}

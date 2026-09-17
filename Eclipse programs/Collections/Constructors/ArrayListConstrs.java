package constructors;

import java.util.ArrayList;

public class ArrayListConstrs {

	public static void main(String[] args) {
		//i) ArrayList() - this one is used to create a default sized ArrayList which is of initial capacity 10. 
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(10);
		al.add(20);
		al.add("AOT");
		al.add(false);
		al.add('M');
		al.add(12.5);
		
		System.out.println(al);
		
		System.out.println("----------------");
		
		//ii) ArayList(int initialCapacity) - This one is used to create an ArrayList with a custom initial capacity.
		ArrayList<Object> al2 = new ArrayList<Object>(20);
		
		al2.add("Java");
		al2.add(1.2);
		al2.add(100);
		al2.add(true);
		al2.add('A');
		al2.add("SQL");
		al2.add(10);
		al2.add(20);
		al2.add("AOT");
		al2.add(false);
		al2.add('M');
		al2.add(12.5);
		
		System.out.println(al2);
		
		System.out.println("----------------");
		
		//iii) ArrayList(Collection c) - this one is used to create an ArrayList by adding all the values of another collection which can be 
		//ArrayList or any other collection.
		ArrayList<Object> al3 = new ArrayList<Object>(al2);
		
		System.out.println(al3);
	}
}

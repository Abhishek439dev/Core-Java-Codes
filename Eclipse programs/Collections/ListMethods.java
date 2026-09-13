package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("java");
		al.add(null);
		al.add(19.4);
		al.add(true);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.get(3));
		
		System.out.println(al.contains("Java"));
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		System.out.println(al);
		System.out.println(al.indexOf(19.4));
		System.out.println(al.indexOf(20));
		
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		
		al.clear();
		System.out.println(al);
		
		System.out.println("--------------------");
		
		ArrayList Al = new ArrayList();
		
		Al.add("java");
		Al.add(null);
		Al.add(19.4);
		Al.add(true);
		Al.add(10);
		
		LinkedList ll = new LinkedList();
		
		ll.addAll(Al);
		System.out.println(ll);
		
		System.out.println("--------------------");

		System.out.println(Al);
		ll.add("SQL");
		ll.add(20);
		ll.add(false);
		System.out.println(ll);
		System.out.println(ll.containsAll(Al));
		
		System.out.println("--------------------");
		
		System.out.println(Al);
		Al.add(2, 10.5);
		System.out.println(Al);
		
		System.out.println("--------------------");
		
		System.out.println(Al);
		Al.set(4, 30);
		System.out.println(Al);
		
		System.out.println("--------------------");
		
		System.out.println(ll);
		System.out.println(Al);
		ll.removeAll(Al);
		System.out.println(ll);
	}
}

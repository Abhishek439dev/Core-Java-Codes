package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		
		for(int i : a) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		String[] fruits = {"Apple", "Banana", "Grapes"};
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("---------------");
		
		ArrayList<Integer> Al = new ArrayList<Integer>();
		
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
		
		for(Object obj : ll) {
			System.out.println(obj);
		}
	}
}

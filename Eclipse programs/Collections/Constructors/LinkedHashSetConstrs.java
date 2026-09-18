package constructors;

import java.util.LinkedHashSet;

public class LinkedHashSetConstrs {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		
		lhs.add("Java");
		lhs.add(10);
		lhs.add(12.35);
		lhs.add(true);
		lhs.add('S');
		
		System.out.println(lhs);
		
		LinkedHashSet<Object> lhs2 = new LinkedHashSet<Object>(10);
		lhs2.add("Java");
		lhs2.add(10);
		lhs2.add(12.35);
		lhs2.add(true);
		lhs2.add('S');
		lhs2.add("JavaScript");
		lhs2.add(13);
		lhs2.add(100.35);
		lhs2.add(false);
		lhs2.add('A');
		lhs2.add("Sql");
		lhs2.add("Programming");
		
		System.out.println(lhs2);
		
		LinkedHashSet<Object> lhs3 = new LinkedHashSet<Object>(10, 0.75f);
		lhs3.add("Java");
		lhs3.add(10);
		lhs3.add(12.35);
		lhs3.add(true);
		lhs3.add('S');
		lhs3.add("JavaScript");
		lhs3.add(13);
		lhs3.add(100.35);
		lhs3.add(false);
		lhs3.add('A');
		lhs3.add("Sql");
		lhs3.add("Programming");
		
		System.out.println(lhs3);
		
		LinkedHashSet<Object> lhs4 = new LinkedHashSet<Object>(lhs);
		System.out.println(lhs4);
	}
}

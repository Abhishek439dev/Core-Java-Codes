package sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(29);
		t.add(30);
		t.add(10);
		t.add(45);
		t.add(10);
		t.add(19);
		t.add(12);
		t.add(5);
		t.add(12);
		
		System.out.println(t);
		
		TreeSet<String> t1 = new TreeSet<String>();
		
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
		
		System.out.println(t1);
		
	}
}

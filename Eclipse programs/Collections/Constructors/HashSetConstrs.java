package constructors;

import java.util.HashSet;

public class HashSetConstrs {

	public static void main(String[] args) {
		//i) HashSet() -> used to create a default HashSet of capacity 16.
		HashSet<Object> hs = new HashSet<Object>();
	
		hs.add("Java");
		hs.add(10);
		hs.add(12.35);
		hs.add(true);
		hs.add('S');
		
		System.out.println(hs);

		//ii) HashSet(int initialCapacity) -> this one is used to create a HashSet with custom initial capacity.
		HashSet<Object> hs2 = new HashSet<Object>(10);
		hs2.add("Java");
		hs2.add(10);
		hs2.add(12.35);
		hs2.add(true);
		hs2.add('S');
		hs2.add("JavaScript");
		hs2.add(13);
		hs2.add(100.35);
		hs2.add(false);
		hs2.add('A');
		hs2.add("Sql");
		hs2.add("Programming");
		
		System.out.println(hs2);

		//iii) HashSet(int initialCapacity, double load factor) -> This is used to create a HashSet with custom capacity and custom load factor.
		HashSet<Object> hs3 = new HashSet<Object>(10, 0.75f);
		hs3.add("Java");
		hs3.add(10);
		hs3.add(12.35);
		hs3.add(true);
		hs3.add('S');
		hs3.add("JavaScript");
		hs3.add(13);
		hs3.add(100.35);
		hs3.add(false);
		hs3.add('A');
		hs3.add("Sql");
		hs3.add("Programming");
	
		System.out.println(hs3);

		//iv) HashSet(Collection c) -> this is used to create a HashSet which obtains its values from another collection in one go.
		HashSet<Object> hs4 = new HashSet<Object>(hs);
		System.out.println(hs4);
		
	}
	
}

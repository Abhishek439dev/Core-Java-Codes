package constructors;

import java.util.Vector;

public class VectorConstrs {

	public static void main(String[] args) {

		//i) Vector() -> Creates a default Vector of initial capacity 10.
		Vector<Object> vc = new Vector<Object>();
		
		vc.add("Java");
		vc.add(10);
		vc.add(true);
		vc.add(129.22);
		vc.add('M');
		vc.add("SQL");
		vc.add(19);
		vc.add(false);
		vc.add(145.22);
		vc.add('F');
		
		System.out.println(vc);
		
		System.out.println("==========================");

		//ii) Vector(int initialCapacity) -> Creates a Vector of custom initial capacity.
		Vector<Object> vc2 = new Vector<Object>(20);
		
		vc2.add("Java");
		vc2.add(10);
		vc2.add(true);
		vc2.add(129.22);
		vc2.add('M');
		vc2.add("SQL");
		vc2.add(19);
		vc2.add(false);
		vc2.add(145.22);
		vc2.add('F');
		vc2.add("Java");
		vc2.add(10);
		vc2.add(true);
		vc2.add(129.22);
		vc2.add('M');
		vc2.add("SQL");
		vc2.add(19);
		vc2.add(false);
		vc2.add(145.22);
		vc2.add('F');
		
		System.out.println(vc2);
		
		System.out.println("==========================");

		//iii) Vector(int initialCapacity, int incremental capacity) -> Creates a Vector of custom initial capacity and incremental capacity.
		Vector<Object> vc3 = new Vector<Object>(20, 3); //the size of new vector will be 3 times of the previous one.
		
		vc3.add("Java");
		vc3.add(10);
		vc3.add(true);
		vc3.add(129.22);
		vc3.add('M');
		vc3.add("SQL");
		vc3.add(19);
		vc3.add(false);
		vc3.add(145.22);
		vc3.add('F');
		vc3.add("Java");
		vc3.add(10);
		vc3.add(true);
		vc3.add(129.22);
		vc3.add('M');
		vc3.add("SQL");
		vc3.add(19);
		vc3.add(false);
		vc3.add(145.22);
		vc3.add('F');
		vc3.add("Java");
		vc3.add(10);
		vc3.add(true);
		vc3.add(129.22);
		vc3.add('M');
		vc3.add("SQL");
		vc3.add(19);
		vc3.add(false);
		vc3.add(145.22);
		vc3.add('F');
		vc3.add("Java");
		vc3.add(10);
		vc3.add(true);
		vc3.add(129.22);
		vc3.add('M');
		vc3.add("SQL");
		vc3.add(19);
		vc3.add(false);
		vc3.add(145.22);
		vc3.add('F');
		
		System.out.println(vc3);
		
		System.out.println("==========================");

		//iv) Vector() -> Creates a Vector which obtains its values from another collection. 
		Vector<Object> vc4 = new Vector<Object>(vc);
		System.out.println(vc4);
	}
}

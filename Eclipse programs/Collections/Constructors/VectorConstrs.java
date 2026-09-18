package constructors;

import java.util.Vector;

public class VectorConstrs {

	public static void main(String[] args) {
		
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
		
		Vector<Object> vc3 = new Vector<Object>(20, 3);
		
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
		
		Vector<Object> vc4 = new Vector<Object>(vc);
		System.out.println(vc4);
	}
}

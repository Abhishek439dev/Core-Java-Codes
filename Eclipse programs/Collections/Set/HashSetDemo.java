package sets;
import java.util.HashSet;  //HashSet class imported to use it.

public class HashSetDemo {

	public static void main(String[] args) {
		//Creating a HashSet to store the Employee objects.
		HashSet<Employee> hs = new HashSet<Employee>();

		//Creating Employee class objects to invoke the constructor and initialize the variables. 
		Employee e1 = new Employee(101, 24, "Eren Yeagr", 12000);
		Employee e2 = new Employee(102, 25, "Levi Ackerman", 17000);
		Employee e3 = new Employee(103, 22, "Arvin Smith", 20000);
		Employee e4 = new Employee(104, 21, "Hange Zoe", 15000);
		Employee e5 = new Employee(105, 25, "Mikasa Ackerman", 14000);

		//Adding the objects to the HashSet collection.
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(new Employee(106, 24, "Armin Arlet", 12000));
		
		//Objects with null values allowed because these are separate different objects in a set, their values are not checked, reference is checked for duplicacy.
		//They may look identical as their values are same (null) but these are two different objects, that's why they are allowed in set.
		hs.add(new Employee(null, null, null, null));
		hs.add(new Employee(null, null, null, null));
		
		//Duplicate objects -> Not Allowed because these reference have already added above in the set.
		hs.add(e1);
		hs.add(e2);

		for(Employee emp : hs) {
			System.out.println(emp); 
		}

		System.out.println("==============================");

		//Creating another HashSet to store Integer values.
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs2.add(10);
		hs2.add(50);
		hs2.add(20);
		hs2.add(40);
		hs2.add(10); //duplicate -> ignored.
		hs2.add(30);
		hs2.add(20); //duplicate -> ignored.
		
		hs2.add(null); //allowed
		hs2.add(null); //duplicate -> ignored.
		
		for(Integer i : hs2) {
			System.out.println(i);
		}
		
	}

}

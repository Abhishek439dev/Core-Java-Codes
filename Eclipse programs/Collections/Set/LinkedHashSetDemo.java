package sets;
//imported LinkedHashSet class to use it.
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

public static void main(String[] args) {
		//creating a LInkedHashSet to store Employee objects.
		LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();

		//Creating Employee objects
		Employee e1 = new Employee(101, 24, "Eren Yeagr", 12000);
		Employee e2 = new Employee(102, 25, "Levi Ackerman", 17000);
		Employee e3 = new Employee(103, 22, "Arvin Smith", 20000);
		Employee e4 = new Employee(104, 21, "Hange Zoe", 15000);
		Employee e5 = new Employee(105, 25, "Mikasa Ackerman", 14000);

		//adding objects to the LinkedHashSet.
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(new Employee(106, 24, "Armin Arlet", 12000));

		//Duplicate objects -> Ignored.
		hs.add(e1);
		hs.add(e2);

		for(Employee emp : hs) {
			System.out.println(emp);
		}
}
}

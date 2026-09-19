package sets;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee e1 = new Employee(101, 24, "Eren Yeagr", 12000);
		Employee e2 = new Employee(102, 25, "Levi Ackerman", 17000);
		Employee e3 = new Employee(103, 22, "Arvin Smith", 20000);
		Employee e4 = new Employee(104, 21, "Hange Zoe", 15000);
		Employee e5 = new Employee(105, 25, "Mikasa Ackerman", 14000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(new Employee(106, 24, "Armin Arlet", 12000));
		
		//null String values -> allowed
		hs.add(new Employee(107, 24, null, 14000));
		
		//Duplicate objects -> Not Allowed
		hs.add(e1);
		hs.add(e2);

		for(Employee emp : hs) {
			System.out.println(emp);
		}
		
		
	}

}

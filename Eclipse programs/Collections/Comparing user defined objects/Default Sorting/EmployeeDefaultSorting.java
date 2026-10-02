package comparing_objects;

import java.util.TreeSet;

public class EmployeeDefaultSorting {

	public static void main(String[] args) {
		
		EmployeeSort emp1 = new EmployeeSort(101, "Erwin Smith", 2245.56);
		EmployeeSort emp2 = new EmployeeSort(102, "Levi Ackerman", 1400.32);
		EmployeeSort emp3 = new EmployeeSort(103, "Hange Zoe", 1400.67);
		EmployeeSort emp4 = new EmployeeSort(104, "Eren Yeager", 2245.00);
		
		TreeSet<EmployeeSort> ts = new TreeSet<EmployeeSort>();
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		
		for(EmployeeSort e : ts) {
			System.out.println(e);
		}
	}
}

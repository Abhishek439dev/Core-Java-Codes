package comparing_objects;

public class EmployeeSort implements Comparable<EmployeeSort>{

	int id;
	String Name;
	double salary;
	
	public EmployeeSort(int id, String name, double salary) {
		
		this.id = id;
		Name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee with id " + id + " is " + Name + ", and his salary is $" + salary;
	}
	
	@Override
	public int compareTo(EmployeeSort emp) {
		return (int) (this.salary - emp.salary);
	}

	}
	
	
	

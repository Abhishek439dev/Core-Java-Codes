package sets;

public class Employee {
	//variables declared to store some details about employees.
	int id;
	int age;
	String name;
	double salary;

	//Constructor created to initialize the variables.
	public Employee(int id, int age, String name, double salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	//toString method is overridden to return the actual content instead of String representation.
	@Override
	public String toString() {
		return "Employee "+name+" with Id "+id+" is "+age+" years old and his salary is $"+salary;
	}
	
}

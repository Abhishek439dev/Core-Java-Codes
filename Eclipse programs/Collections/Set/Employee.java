package sets;

public class Employee {

	int id;
	int age;
	String name;
	double salary;
	
	public Employee(int id, int age, String name, double salary) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee "+name+" with Id "+id+" is "+age+" years old and his salary is $"+salary;
	}
	
}

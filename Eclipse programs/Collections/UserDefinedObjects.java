package list;
//In this program we are going to store user-defined objects in the collections and traverse it via for-each loop.
public class UserDefinedObjects {

	int id;
	String name;
	double salary;
	
	public UserDefinedObjects(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString () {
		return "The Employee with id "+id+" is "+name+" and his salary is $"+salary;
	}
		
}

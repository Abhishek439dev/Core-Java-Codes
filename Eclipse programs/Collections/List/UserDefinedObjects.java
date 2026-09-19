package list;
//In this program we are going to store user-defined objects in the collections and traverse it via for-each loop.
public class UserDefinedObjects {
	//creating some variables.
	int id;
	String name;
	double salary;

	//Constructor to initialize the variables with Object creation.
	public UserDefinedObjects(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Overriding the toString method to get the actual content instead of String Representation.
	@Override
	public String toString () {
		return "The Employee with id "+id+" is "+name+" and his salary is $"+salary;
	}
		
}

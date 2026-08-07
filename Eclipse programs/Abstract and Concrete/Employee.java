package com;

public class Employee extends Person{

	@Override
	void person() {
		System.out.println("This person is an Employee");
	}
	
	//We can occasionally override the work method as well.
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.person();    //calling the override method.
		
		e.work();      //calling the concrete method.
		
	}
}

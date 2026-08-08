package com;

public class Employee implements Person{

	@Override
	public void Work() {
		System.out.println("This person is an employee of XYZ company.");
	}
	
	public static void main(String[] args) {
		Employee e  = new Employee();
		e.Work();
		
		System.out.println("The age of this employee is "+Person.age);
	}
}

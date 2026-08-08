package com;

public class Employee implements Person{                                    //class --> interface Is-A relationship is achieved using 'implements' keyword.

	@Override
	public void Work() {                                                     //The abstract method declared in 'Person' interface needs to be override.
		System.out.println("This person is an employee of XYZ company.");
	}
	
	public static void main(String[] args) {
		Employee e  = new Employee();                                       //Object of the sub-class.
		e.Work();                                                           //overrided method called.
		
		System.out.println("The age of this employee is "+Person.age);      //Variables in interface are static hence, className.variableName
	}
}

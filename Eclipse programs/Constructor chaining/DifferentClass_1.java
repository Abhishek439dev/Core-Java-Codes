package com;

public class DifferentClass_1 {

	//In different classes, constructor chaining is achieved using, 'super()' calling method. It is also of two types. Implicit calling and explicit calling.
	
	DifferentClass_1(){ //When a constructor is non-parameterized, it will be calling implicitly(automatically) from parent class. 
		System.out.println("non-parameterized constructor of class 1");
	}
	
	DifferentClass_1(int age, String name){  //A non-parameterized const. requires explicit calling using the 'super()' calling statement.
		System.out.println("parameterized constructor of class 1");
		System.out.println("Age of person is "+age+" and his name is "+name);
	}
}

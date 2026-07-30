package com;

public class SameClass {

	//In same class constructor chaining is achieved using 'this()' calling statement. We have to maintain constructor overloading rules.
	
	//first constructor with no parameter.
	SameClass(){ 
		this(2, 3);             //this calling statement will call the another constructor in the same class. As that const. accepting arguments we have to pass values.
		System.out.println("This will print later.");
	}
	
	//Another constructor with two parameters.
	SameClass(int a, int b){
		System.out.println("This will be invoked by the first constructor.");
		System.out.println("Sum of arguments is "+ (a+b));       //This will print the sum of values of the parameters.
		
	}
	
	public static void main(String[] args) {
		new SameClass();                      //object creation to call the first constructor.
	}
}

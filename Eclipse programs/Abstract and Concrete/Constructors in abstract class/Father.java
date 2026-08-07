package org;

//Constructors in Abstract Class.
public abstract class Father {

	//non-static variables 
	int fAge;
	String fName;
	
	//Parameterized constructor
	Father(int age, String name){
		this.fAge = age;                       //variables initialized via constructor.
		this.fName = name;
		System.out.println("This is father's constructor");    //A print statement.
	}
}

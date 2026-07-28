package com;

public class Static_DifferentClass {

	//Accessing the static properties of from another class.
	//We are going to access the properties of Static_SameClass.
	
	public static void main(String[] args) {
		
		//To access static properties through a different class we have to use the syntax ClassName.StaticPropertyName
		System.out.println(Static_SameClass.age);
		Static_SameClass.display();
		
		//Static properties can be accessed via object creation as well, But it is not a good practice.
		Static_SameClass SC = new Static_SameClass();
		System.out.println(SC.age);
		SC.display();
		
	}
}

package com;

public class Static_SameClass {

	//Accessing static properties in the same class.
	static int age = 10;
	
	static void display() {
		System.out.println("This is a static method.");
	}
	
	public static void main(String[] args) {
		
		//In the same class we can call the properties directly or by ClassName.Static_Property_Name.
		System.out.println(age);
		System.out.println(Static_SameClass.age);
		
		display();
		Static_SameClass.display();
	}
}

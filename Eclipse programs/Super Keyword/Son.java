package com;

public class Son extends Father {   //extend keyword for Is-A relationship

	String name = "Tom";            //Variables for child class.
	int age = 25;
	
	void display() {                 //Method to display parent class and child class properties.
		System.out.println(this.name+"'s age is "+ this.age);                                      //'this' keyword is used to access member variables of same class.
		System.out.println("Tom's father name is "+super.name+" and his age is "+super.age);       //'super' keyword is used to access variables of parent class.
		super.work();                                                                              //'super' keyword to call parent class method.
	}
	
	public static void main(String[] args) {
		
		Son S  = new Son();          //Object creation because of non-static properties.
		S.display();                 //method called.
		
	}
}

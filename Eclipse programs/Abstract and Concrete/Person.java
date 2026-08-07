package com;

//abstract method can have both abstract and concrete methods.
public abstract class Person {

	abstract void person();               //abstract method (without any implementation only declaration).
	
	void work() {                         //concrete method (declaration + implementation).
		System.out.println("Let's work");
	}
}

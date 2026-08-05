package com;

public class Test {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		v1.start();                 //method not overridden in Vehicle class.
		
		Car c = new Car();
		c.start();                  //method overridden in car class.
		
		Bike b = new Bike();
		b.start();                  //method overridden again in bike class.
		
		Vehicle v = new Car();      //upcasting to Car's object.
		v.start();                  //Run-time polymorphism.
		
		v = new Bike();             //upcasting to Bike's object.
		v.start();                  //Run-time polymorphism.
	

	}
	
	
}

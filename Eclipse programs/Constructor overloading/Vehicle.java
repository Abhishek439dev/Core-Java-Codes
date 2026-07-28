package com;

public class Vehicle {
	
	//Constructor overloading involves creation of similar constructors which are different in their arguments.
	Vehicle(){                               //No parameter.
		System.out.println("This constructor don't have any argument");
	}
	
	Vehicle(int cost){                       //One parameter with int datatype.
		System.out.println("car cost is $"+cost);
	}
	
	Vehicle(String Brand){                   //One parameter with String datatype.
		System.out.println("Brand name is "+Brand);
	}
	
	Vehicle(int number, String Name){        // Two parameters with int and String datatype sequence.
		System.out.println("Car's number is "+number+" and "+"Car's name is "+Name);
	}
	
	Vehicle(String Name, int number){        // Two parameters with a different datatypes sequence.
		System.out.println("Car's name is "+Name+" and "+"Car's number is "+number);
	}
	
	public static void main(String[] args) {
		new Vehicle();
		new Vehicle(30000);
		new Vehicle("Toyota");
		new Vehicle(12345, "Land Cruiser");
		new Vehicle("Fortuner", 3333);
	}

}

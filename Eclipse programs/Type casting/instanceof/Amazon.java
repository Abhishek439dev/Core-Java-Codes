package com;

public class Amazon {

	//Method to return an object of a sub class as per user input.
	//Electronics is a non-primitive or derived data-type of this method as it can return multiple values.
	Electronics Shopping(int choice){    
		if (choice == 1) {
			return new Laptop();    //returning an object of Laptop class if choice is 1.
		}
		else if (choice == 2) {
			return new Mobile();    //returning an object of Laptop class if choice is 2.
		}
		else {
			return null;            //not returning anything in case of a different input (else condition is mandatory to define the return type in case of values other than 1 and 2).
		}
	}
}

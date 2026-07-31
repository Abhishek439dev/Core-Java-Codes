package com;

public class Amazon {

	Electronics Shopping(int choice){
		if (choice == 1) {
			return new Laptop();
		}
		else if (choice == 2) {
			return new Mobile();
		}
		else {
			return null;
		}
	}
}

package com;

import java.util.Scanner;

public class Test2 {

	void invokeStart(Vehicle V) {
		V.start();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to start \n1: Car 2: Bike");
		
		int choice = scan.nextInt();
		
		Test2 t2 = new Test2();
		
		if (choice == 1) {
			t2.invokeStart(new Car());
		}
		else if(choice ==2 ) {
			t2.invokeStart(new Bike());
		}
		else {
			System.out.println("Invalid choice");
		}
		
		scan.close();
	}
}

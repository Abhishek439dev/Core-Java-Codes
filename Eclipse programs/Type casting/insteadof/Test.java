package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Amazon AZ = new Amazon();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		
		Electronics obj = AZ.Shopping(choice);
		
		if(obj instanceof Laptop ) {
			System.out.println("ordered laptop");
		}
		else if(obj instanceof Mobile) {
			System.out.println("ordered Mobile");
		}
		else {
			System.out.println("Invalid");
		}
		
		scan.close();
	}
}

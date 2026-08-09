package org;

import java.util.Scanner;

public class Demo {

	Scanner sc = new Scanner(System.in);
	
	//function that can print what the user has input.
	public void printInput() {
		int num = sc.nextInt();
		System.out.println("You entered:");
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("Enter a number");
		d.printInput();
	}
}

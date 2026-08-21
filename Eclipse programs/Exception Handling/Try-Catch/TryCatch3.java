package com;

import java.util.Scanner;

public class TryCatch3 {

	public static void main(String[] args) {
		
		System.out.println("<------Welcome to division calculator----->");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num1 = scan.nextInt();
		System.out.println("Enter the denominator");
		int num2 = scan.nextInt();
		
		try {
			System.out.println("The Quotient is: "+num1/num2);
		}
		catch(NullPointerException e) {
			System.out.println("Invalid");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		catch(Exception e) {
			System.out.println("[INVALID] SuperClass Exception Handler");
		}
			
		System.out.println("<-----Thanks for using---->");
		scan.close();
	}
}

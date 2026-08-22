package org;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numerator");
		int num1 = scan.nextInt();
		
		System.out.println("Enter denominator");
		int num2 = scan.nextInt();
		
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("There is some problem ->"+e.getMessage());
		}
		
		finally {
			System.out.println("Thank you for using our service.");
		}
		
		System.out.println("End");
		scan.close();
	}
}

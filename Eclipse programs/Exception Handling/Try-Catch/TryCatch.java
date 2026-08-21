package com;

import java.util.Scanner;

public class TryCatch {
//This program demonstrates the functionality of try and catch statements.
	public static void main(String[] args) {
		
		System.out.println("<------Welcome to division calculator----->");
		//Accepting dynamic inputs from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num1 = scan.nextInt();
		System.out.println("Enter the denominator");
		int num2 = scan.nextInt();
		
		try {
			System.out.println("The Quotient is: "+num1/num2);   //Critical lines of code should be there in try block.
		}
		//As we knew an Arithmetic exception can occur we can directly write the exception name. variable e is storing the object thrown by ArithmeticException class.
		catch(ArithmeticException e) {
			System.out.println("Invalid denominator");  //catch block contains the code that should execute once exception occurs.
		}
			
		System.out.println("<-----Thanks for using---->");  //This line of code won't execute if exception occurs and is not handled.
		scan.close();
		
	}
}

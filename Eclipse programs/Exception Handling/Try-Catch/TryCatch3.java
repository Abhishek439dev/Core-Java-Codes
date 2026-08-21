package com;

import java.util.Scanner;

public class TryCatch3 {
//In this program we have multiple catch blocks in case we don't know what kind of exception might occur. 
	public static void main(String[] args) {
		
		System.out.println("<------Welcome to division calculator----->");
		//Accepting dynamic user inputs to calculate.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num1 = scan.nextInt();
		System.out.println("Enter the denominator");
		int num2 = scan.nextInt();
		//critical code under try block.
		try {
			System.out.println("The Quotient is: "+num1/num2);
		}
			//catch block one catching a NullPointerException if occurred.
		catch(NullPointerException e) {
			System.out.println("Invalid");
		}
			//catch block two catching a ArrayIndexOutOfBoundsException if occurred.
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
			//catch block third will catch all the exceptions as Exception is the Superclass of all Exceptions. So, it can be used if we don't know the exception name.
			//the super class exception catch block should be written at last, otherwise the other catch blocks will become unreachable.
		catch(Exception e) {
			System.out.println("[INVALID] SuperClass Exception Handler");
		}
			
		System.out.println("<-----Thanks for using---->");
		scan.close();
	}
}

package org;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  //accepting dynamic inputs from user.
		System.out.println("Enter numerator");  //prompt
		int num1 = scan.nextInt();              //storing the user input in variable num1.
		
		System.out.println("Enter denominator"); //prompt
		int num2 = scan.nextInt();              //storing the user input in variable num2.
		
		try {
			System.out.println(num1/num2);      //Storing the critical code in try block.
		}
		catch(ArithmeticException e) {
			System.out.println("There is some problem ->"+e.getMessage());   //Execption handled and the small message for the exception occurence is printed.
		}

		//This block of code will execute always no matter exception occurs or not and if it is handled properly or not.
		finally {
			System.out.println("Thank you for using our service.");  
		}
		
		System.out.println("End"); //This line won't execute if an exception occured but is not handled with a suitable exception class.
		scan.close();
	}
}

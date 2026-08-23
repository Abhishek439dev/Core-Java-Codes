package com;

import java.util.Scanner;

public class TryCatch {
//This program demonstrates an unchecked exception.
	public static void main(String[] args) {
		
		System.out.println("<------Welcome to division calculator----->");
		//Accepting dynamic inputs from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num1 = scan.nextInt();
		System.out.println("Enter the denominator");
		int num2 = scan.nextInt();
		
		System.out.println("The Quotient is: "+num1/num2);   //This line of code won't higlight with redline even when this line can give arithmetic exception
                                                             //because these exceptions are not detected by the compiler. 
			
		System.out.println("<-----Thanks for using---->");  //This line of code won't execute if exception occurs and is not handled.
		scan.close();
		
	}
}

/*
Output: 
We will get ArithmeticException but we will came to know about it after the program execution when such values are received (zero denominator).
The compiler won't tell us about the possible exception before running the program.
*/

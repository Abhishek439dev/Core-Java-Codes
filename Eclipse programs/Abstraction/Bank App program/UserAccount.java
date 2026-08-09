package org;

import java.util.Scanner;

public class UserAccount {

	public static void main(String[] args) {
		Bank B = new ATM();                             //Bank class instantiased to access all the methods.
		Scanner scan = new Scanner(System.in);          //Scanner object creation to accept user inputs.
		
		while(true) {                                   //while loop to repeat the process until exited via exiting method.
			System.out.println("-------------------------------");
			System.out.println("Welcome to XYZ Bank App\nPlease choose from the menu.\n1)Deposit\n2)Withdraw\n3)Check Balance\n4)Exit");  //Prompt to ask user input.
			System.out.println("-------------------------------");
			int choice = scan.nextInt();                //storing user input in choice.
			
			//switch statements to perform action as per user input.
			switch(choice) {

			//for Depositing
			case 1: 
				System.out.println("Enter the amount you want to deposit");
				int dAmt = scan.nextInt();   //asking the deposit amount.
				B.Deposit(dAmt);             //Calling the deposit function written in Bank class and passing the amount entered by user.
				break;                       //to stop execution of other case statements.

			//for Withdrawl
			case 2:
				System.out.println("Enter the amount you want to withdraw.");
				int wAmt = scan.nextInt();   //asking the withdrawl amount.
				B.Withdraw(wAmt);            //Calling the withdrawl function written in Bank class and passing the amount entered by user.
				break;

			//to check balance
			case 3: 
				B.Balance();                 //Calling the balance checking method from Bank class.
				break;

			//to close the program
			case 4: 
				B.Exit();                    //Calling the exit method.
				scan.close();                //Stop accepting user input.
				
			default:           
				System.out.println("Please enter a valid choice");  //default case if user enters an invalid choice.
			
			}
		}
		
		
	}
	
}

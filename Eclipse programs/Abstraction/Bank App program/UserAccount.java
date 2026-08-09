package org;

import java.util.Scanner;

public class UserAccount {

	public static void main(String[] args) {
		Bank B = new ATM();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("Welcome to XYZ Bank App\nPlease choose from the menu.\n1)Deposit\n2)Withdraw\n3)Check Balance\n4)Exit");
			System.out.println("-------------------------------");
			int choice = scan.nextInt();
			switch(choice) {
			
			case 1: 
				System.out.println("Enter the amount you want to deposit");
				int dAmt = scan.nextInt();
				B.Deposit(dAmt);
				break;
				
			case 2:
				System.out.println("Enter the amount you want to withdraw.");
				int wAmt = scan.nextInt();
				B.Withdraw(wAmt);
				break;
			
			case 3: 
				B.Balance();
				break;
				
			case 4: 
				B.Exit();
				scan.close();
				
			default:
				System.out.println("Please enter a valid choice");
			
			}
		}
		
		
	}
	
}

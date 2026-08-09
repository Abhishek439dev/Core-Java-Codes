package org;

public class ATM implements Bank{

	int balance = 10000;
	
	public void Deposit(int dAmt) {
		
		if(dAmt<0) {
			System.out.println("Enter a valid amount.");
		}else {
			System.out.println("Depositing amount Rs."+dAmt);
			balance += dAmt;
			System.out.println("Rs."+dAmt+" deposited successfully.");
		}
	}
	
	public void Withdraw(int wAmt) {

		if(wAmt>balance) {
			System.out.println("Your current balance is not enough.");
		}
		else if(balance<8000) {
			System.out.println("Your current account balance is low. Please ensure maintaining minimum balance to avoid charges.");
			System.out.println("Withdrawing amount Rs."+wAmt);
			balance -= wAmt;
			System.out.println("Rs."+wAmt+" withdrawn successfully.");
		} else {
			System.out.println("Withdrawing amount Rs."+wAmt);
			balance -= wAmt;
			System.out.println("Rs."+wAmt+" withdrawn successfully.");
		}
		
	}
	
	public void Balance() {
		System.out.println("Your account balance is Rs."+balance);
		if(balance<8000) {
			System.out.println("Your current account balance is low, please deposit money to avoid charges");
		}
	}
	
	public void Exit() {
		System.out.println("Thank you for using our services. Have a nice day.");
		System.exit(0);
	}
	
}

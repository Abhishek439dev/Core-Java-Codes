package org;

//Is-A relationship to inherit and define all the interface methods.
public class ATM implements Bank{

	int balance = 10000;                   //A random amount assigned to the account balance.

	@Override
	public void Deposit(int dAmt) {           //Overriding the Deposit method.

		//condition to check if the depositing amount is valid or not.
		if(dAmt<0) {
			System.out.println("Enter a valid amount.");
		}else {
			System.out.println("Depositing amount Rs."+dAmt);
			balance += dAmt;                   //Increasing the balance by adding the deposited amount.
			System.out.println("Rs."+dAmt+" deposited successfully.");
		}
	}

	@Override
	public void Withdraw(int wAmt) {
		//Condition to check if there is enough balance in account to withdraw the required amount. Stops the transaction if true.
		if(wAmt>balance) {
			System.out.println("Your current balance is not enough.");
		}
		//Another check to ensure minimum balance in the account. it allows the withdrawl but let the user know about maintaining min. balance.
		else if((balance-wAmt)<8000) {
			System.out.println("Your current account balance is low. Please ensure maintaining minimum balance to avoid charges.");
			System.out.println("Withdrawing amount Rs."+wAmt);
			balance -= wAmt;                  //Deducting the withdrawl amount from balance with a warning.
			System.out.println("Rs."+wAmt+" withdrawn successfully.");
		} else {
			System.out.println("Withdrawing amount Rs."+wAmt);
			balance -= wAmt;                 //Deducting the withdrawl amount from balance.
			System.out.println("Rs."+wAmt+" withdrawn successfully.");
		}
		
	}

	@Override
	public void Balance() {
		System.out.println("Your account balance is Rs."+balance);       //Showing the account balance.
		if(balance<8000) {
			System.out.println("Your current account balance is low, please deposit money to avoid charges");   //Showing the low balance message if balance is low.
		}
	}

	@Override
	public void Exit() {
		System.out.println("Thank you for using our services. Have a nice day.");   //Message to display before closing the program.
		System.exit(0);                                                             //Terminated the program successfuly.
	}
	
}

package org;

//Interface used to show what the application can do. 
public interface Bank {
	
	void Deposit(int dAmt);    //Amount depositing method.
	void Withdraw(int wAmt);   //withdrawing method.
	void Balance();            //balance checking method.
	void Exit();               //Method to close the program.

}

package customExp;

import java.util.Scanner;

public class WithdrawAmount {

	public static void main(String[] args) {
		
		int balance = 10000;                                    //initial balance.
		Scanner scan = new Scanner(System.in);                  //Acceepting dynamic inputs.
		System.out.println("Enter the amount to withdraw");     //Prompt
		int amt = scan.nextInt();                               //User input stored in variable.
		scan.close();                                           //Scanner method closed.

		//Conditoinal statements to define when to invoke the exception.
		if(amt <= balance) {
			System.out.println(amt+" withdrawn successfully");
		}
		else {      //throw exception when withdrawing amount is more than the available balance and we have to handle it immediately(checked exception).
			try {
				throw new InsufficientBalanceException("Insufficient balance");   //throw keyword is used to throw the exception object and we have given the String input which will initialize the private variable.
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());  //Printing the short message of exception which was initialized above by throwing class object.
			}
			
		}
		
	}
}

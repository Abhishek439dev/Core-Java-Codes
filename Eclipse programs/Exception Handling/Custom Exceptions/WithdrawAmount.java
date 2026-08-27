package customExp;

import java.util.Scanner;

public class WithdrawAmount {

	public static void main(String[] args) {
		
		int balance = 10000;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amt = scan.nextInt();
		scan.close();
		
		if(amt <= balance) {
			System.out.println(amt+" withdrawn successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient balance");
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
}

package in;

import java.util.Scanner;
//In this program, we have shown an Unchecked exception but it is handled as it should be, to ensure proper execution of a program.
public class UncheckedExp_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		//We need to handle unchecked exceptions but not immediately.
		try {
			System.out.println(num1/num2); //this line of code can give ArithmeticException but it will get unnoticed by the compiler even if we don't handle it.
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("Thanks for using.");
		scan.close();
		
	}
}

package customExp;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter login ID");
		String id = scan.next();
		
		System.out.println("Enter Password");
		int password = scan.nextInt();
		
		scan.close();
		
		if(id.equals("admin")) {
			
			if(password == 123) {
				System.out.println("Login Successful");
			}
			else {
				try {
					InvalidPasswordException obj = new InvalidPasswordException();
					throw obj;
				}
				catch(InvalidPasswordException e) {
					System.out.println("Incorrect Password.");
					
				}
				
			}
		}
		else {
			System.out.println("Your Id is incorrect.");
		}
		
		
	}
}

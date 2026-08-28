package customExp;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //Accepting dynamic user inputs.
		 
		System.out.println("Enter login ID");   //Prompt
		String id = scan.next();                //Storing user input.
		
		System.out.println("Enter Password");   //Prompt
		int password = scan.nextInt();          //Storing user input.
		
		scan.close();                           //Stopped taking user input.
		
		if(id.equals("admin")) {                //equals method in String class is overriden to compare the actual content.
			
			if(password == 123) {               //nested if condition to check password after the user id.
				System.out.println("Login Successful");     //message to print if both userid and password are correct.
			}
			else {                              //else the exception invokes.
				try {
					InvalidPasswordException obj = new InvalidPasswordException();  //creating the custom exception class object.
					throw obj;                                                      //throwing the custom exception class object.
				}
				catch(InvalidPasswordException e) {
					System.out.println("Incorrect Password.");                     //message to print upon catching exception.
					
				}
				
			}
		}
		else {
			System.out.println("Your Id is incorrect.");
		}
		
		
	}
}

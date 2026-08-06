package com;

import java.util.Scanner;         

public class User_Input {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);    //Scanner function to take user input.
		Calculator C = new Logic();            //Upcasting.

		//while loop to repeat the calculator program until exited.
		while(true) {
			System.out.println("------------------------");
			System.out.println("Enter a Choice:\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)Exit");   //prompt to choose what to do?
			System.out.println("------------------------");
			int choice = s.nextInt();                              //storing user input in choice variable.

			//switch-case statements to pass user choice and perform actions as per the choice.
			switch (choice) {
			case 1: 
				System.out.println("Enter first number");        //prompt to ask for first number.
				int num1 = s.nextInt();                          //storing first number.
				System.out.println("Enter Second number");       //prompt to ask for second number.
				int num2 = s.nextInt();                          //storing second number.
				System.out.println("Result: "+C.add(num1, num2));  //printing the results along with calling the appropriate method.
				break;                                              //break statement to come out of the switch-case statements.
				
			case 2: 
				System.out.println("Enter first number");
				int num3 = s.nextInt();
				System.out.println("Enter Second number");
				int num4 = s.nextInt();
				System.out.println("Result: "+C.sub(num3, num4)); 
				break;
				
			case 3: 
				System.out.println("Enter first number");
				int num5 = s.nextInt();
				System.out.println("Enter Second number");
				int num6 = s.nextInt();
				System.out.println("Result: "+C.multiply(num5, num6)); 
				break;
				
			case 4: 
				System.out.println("Enter first number");
				int num7 = s.nextInt();
				System.out.println("Enter Second number");
				int num8 = s.nextInt();
				System.out.println("Result: "+C.divide(num7, num8)); 
				break;
			
			case 5: 
				System.out.println("Thank you for using Calculator App.");     //Last case to exit the ptogram.
				C.exit();                                                      //Calling the exiting function.
				s.close();                                                     //closing scanner function.
				break;                                                         //break statement is necessary to avoid executing the next case statements.
				
			default:
				System.out.println("Invalid Choice");                          //default output in case of value input other than the above cases.
			}
			
		}
		
	}

}

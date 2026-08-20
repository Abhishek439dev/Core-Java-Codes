package com;

import java.util.Scanner;         

public class User_Input {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);    //Scanner function to take user input.
		Calculator C = new Logic();            //Up-casting.

		//while loop to repeat the calculator program until exited.
		while(true) {
			System.out.println("------------------------");
			System.out.println("Enter a Choice:\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)Exit");   //prompt to choose what to do?
			System.out.println("------------------------");
			int choice = s.nextInt();                              //storing user input in choice variable.
			
			//declared variables declared outside if block so that they can be used outside the if block.
			int num1 = 0;
			int num2 = 0;
			
			//if block to avoid accepting inputs for choice = 5 (exit).
			if(choice >=1 && choice <= 4) {
				System.out.println("Enter first number");        //prompt to ask for first number.
				num1 = s.nextInt();                          //storing first number.
				System.out.println("Enter Second number");       //prompt to ask for second number.
				num2 = s.nextInt();                          //storing second number.
			}

			//switch-case statements to pass user choice and perform actions as per the choice.
			switch (choice) {
			case 1: 
				System.out.println("Result: "+C.add(num1, num2));  //printing the results along with calling the appropriate method.
				break;                                              //break statement to come out of the switch-case statements.
				
			case 2: 
				System.out.println("Result: "+C.sub(num1, num2)); 
				break;
				
			case 3: 
				System.out.println("Result: "+C.multiply(num1, num2)); 
				break;
				
			case 4: 
				System.out.println("Result: "+C.divide(num1, num2)); 
				break;
			
			case 5: 
				System.out.println("Thank you for using Calculator App.");     //Last case to exit the program.
				C.exit();                                                      //Calling the exiting function.
				s.close();                                                     //closing scanner function.
				break;                                                         //break statement is necessary to avoid executing the next case statements.
				
			default:
				System.out.println("Invalid Choice");                          //default output in case of value input other than the above cases.
			}
			
		}
		
	}

}

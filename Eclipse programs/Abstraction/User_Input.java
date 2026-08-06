package com;

import java.util.Scanner;

public class User_Input {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Calculator C = new Logic();
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("Enter a Choice:\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)Exit"); 
			System.out.println("------------------------");
			int choice = s.nextInt();
		
			switch (choice) {
			case 1: 
				System.out.println("Enter first number");
				int num1 = s.nextInt();
				System.out.println("Enter Second number");
				int num2 = s.nextInt();
				System.out.println("Result: "+C.add(num1, num2)); 
				break;
				
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
				System.out.println("Thank you for using Calculator App.");
				C.exit();
				s.close();
				break;
				
			default:
				System.out.println("Invalid Choice");
			}
			
		}
		
	}

}

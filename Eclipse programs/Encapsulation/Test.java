package com;

import java.util.Scanner;                               //java.util.scanner to use Scanner method.

public class Test {
	
	public static void main(String[] args) {
		
		Employee E = new Employee();                    //Object creation to access EMployee class properties (getter and setter functions). 
		
		Scanner s = new Scanner(System.in);             //Scanner function to accept user input.
		
		System.out.println("Enter Age");                //Prompt to ask user to enter age.
		int age = s.nextInt();                          //storing user input into another variable 'age'.
		
		E.setAge(age);                                  //Passing the user input via setter method for 'age' variable.
		System.out.println(E.getAge());                 //Display of age via getter method and print statement.
		
		System.out.println("-----------------");
		
		System.out.println("Enter a Name");             //Prompt to take user input for name.
		String Name = s.next();                         //Storing the user input into a variable 'name'.
		
		E.setEmpName(Name);                             //Passing user input via setter method for 'name' variable.
		System.out.println(E.getEmpName());             //Display of name via getter method and print statement.
		
		s.close();                                      //closing scanner object to stop accepting user input.
	}

}

package com;

import java.util.Scanner;   

public class Test {

	public static void main(String[] args) {
		
		Amazon AZ = new Amazon();                 //object-creation to use Amazon class properties.
		Scanner scan = new Scanner(System.in);    //Scanner object to take user input.
		
		System.out.println("Enter your choice:");  //prompt to ask user input.
		int choice = scan.nextInt();               //Storing the user input in variable choice.
		
		Electronics obj = AZ.Shopping(choice);     //Passing the choice value to the Shopping method and storing the returned value in obj variable.
		
		
		//Comparing to check the returned object is an instance of which class?
		if(obj instanceof Laptop ) {                
			System.out.println("ordered laptop");   //it will execute only if a Laptop class's object is returned.[ new Laptop() ]
			//We can access the Laptop class properties after downcasting.
		}
		else if(obj instanceof Mobile) {
			System.out.println("ordered Mobile");   //it will execute only if a Mobile class's object is returned.[ new Mobile() ]
			//We can access the Mobile class properties after downcasting.
		}
		else {
			System.out.println("Invalid");          //else condition is nothing(null) is returned.
		}
		
		scan.close();                               //Closing the Scanner method to take user inputs.
	}
}

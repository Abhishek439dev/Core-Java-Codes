package com;

import java.util.Scanner;   //Scanner function imported to accept user input.

public class CountSameNO {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //new object of Scanner function created.
		
		System.out.println("Enter a number");  //Prompt message to let user input a number.
		int userIn = scan.nextInt();           //Storing the user input in a variable.
		
		int occurence = 0;                     //Variable initialized to count number of occurence of a user input.
		int[] arr = {10,20,30,20,10,50,20,50,30,40,20,10,60};  //Array where the user input has to be checked.
		
		for(int i = 0; i< arr.length; i++) {            //for-loop for traversing through the array.
			if(userIn == arr[i]) {                      //condition to increment the occurence count by 1 if user input is same as a number in array.
				occurence++;
			}
		}
		System.out.println(occurence);                 //display of results.
		scan.close();                                  //closing of scanner method to release memory.
	}
	}

package com;

import java.util.Arrays;  //Class imported to print Arrays.
import java.util.Scanner;

public class TryCatch2 {

public static void main(String[] args) {
	
	int[] arr = new int[4];  //Array declared and created.
	Scanner scan = new Scanner(System.in);  //Accepting dynamic inputs to initialize the Array.
	System.out.println("Enter numbers in array");
	
	
	int i=0;
	//While loop to keep accepting the user input until the Array is initialized.
	while(i < arr.length) {
		System.out.println("--------------------------------");
		//Critical lines of code under try block
		try {
			System.out.println("In which position you want to enter your number ?");
			int position = scan.nextInt();
			System.out.println("Now enter your number for this position");
			int number = scan.nextInt();
			
			arr[position] = number;
			System.out.println("Number assigned successfully");
		}
		//If exception occurs in the try block it will be catched by catch block and the content under it will execute.
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index of array, the array can have only 5 elements.");
		}
		
		System.out.println("--------------------------------");
		
		i++;
	}
	
	scan.close();
	
	System.out.println(Arrays.toString(arr));   //Printing the initialized Array.
	
	}

	
}

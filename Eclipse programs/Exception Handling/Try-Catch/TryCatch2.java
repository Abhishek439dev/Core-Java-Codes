package com;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatch2 {

public static void main(String[] args) {
	
	int[] arr = new int[4];
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter numbers in array");
	
	
	int i=0;
	while(i < arr.length) {
		System.out.println("--------------------------------");
		try {
			System.out.println("In which position you want to enter your number ?");
			int position = scan.nextInt();
			System.out.println("Now enter your number for this position");
			int number = scan.nextInt();
			
			arr[position] = number;
			System.out.println("Number assigned successfully");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index of array, the array can have only 5 elements.");
		}
		
		System.out.println("--------------------------------");
		
		i++;
	}
	
	scan.close();
	
	System.out.println(Arrays.toString(arr));
	
	}

	
}

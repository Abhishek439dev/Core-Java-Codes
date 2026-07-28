package com;

public class SumOfArray {
	
	public static void main(String[] args) {

		int[] a = {3, 20, 10};   
		int sum = 0;                 //Variable to store the sum of digits.
		
		for(int i = 0; i< (a.length); i++) {  //for-loop to traverse through the array.
		sum += a[i];                       //sum = sum + arrayNumber
	}
		System.out.println(sum);              //Result display.
	}
}

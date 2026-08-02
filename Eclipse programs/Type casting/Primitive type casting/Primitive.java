package org;

public class Primitive {
	
	//Primitive type casting is of two types, Widening and Narrowing.

	public static void main(String[] args) {
		
		//Widening
		System.out.println("WIDENING");
		int a = 30;
		double b = a;   //Implicit conversion (Simple assigning).
		
		System.out.println("Integer value "+a+ "\nConverted to double value " +b);
		
		System.out.println("------------------------------");
		
		char c = 'A';
		int i = c;    //Implicit conversion (Simple assigning).
		
		System.out.println("char value "+c+ "\nConverted to its ASCII value " +i);
		
		System.out.println("================================");
		
		//Narrowing
		System.out.println("NARROWING");
		double x = 3.56;
		int y = (int)x;  //Explicit conversion (requires syntax).
		
		System.out.println("Double value "+x+ "\nConverted to integer value " +y);
		
		System.out.println("------------------------------");
		
		int t = 97;
		char w = (char)t;   //Explicit conversion (requires syntax).
		
		System.out.println("int/ASCII value "+t+ "\nConverted to its respective char value " +w);
		
	}
	

	}



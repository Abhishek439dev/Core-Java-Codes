package org;

public class Concatenation {

	public static void main(String[] args) {
		
		//The String values(double quotes) dominates over other data types(char or int) and concatenates the data always.
		System.out.println("A"+"B");  
		System.out.println("A"+20);   
		System.out.println("A"+'B');  
		System.out.println("20"+"20"); 
		
		//The char values(single quotes) with arithmetic operators are converted to their ACII values and solved.
		System.out.println('A'+'B');  
		System.out.println('A'-'B');  
		System.out.println('A'*'B'); 
		System.out.println('A'+20);   
		
	}
}

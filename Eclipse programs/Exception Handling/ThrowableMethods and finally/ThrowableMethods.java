package org;

public class ThrowableMethods {

	public static void main(String[] args) {
		
		System.out.println("Start");  //Marks the begining of the program.
		
		try {
			System.out.println(10/0);  //Error prone code written in try block.
		}
		catch(Exception e) {          
			e.printStackTrace();       //Will print a detailed explanation of the exception.
			System.out.println(e.getMessage());    //will print a small message describing the reason of exception.
		}
		
		System.out.println("End");  //Marks the end of the program.
	}
}


/*
Output: 
Start
java.lang.ArithmeticException: / by zero
	at Exception_Handling/org.ThrowableMethods.main(ThrowableMethods.java:10)
/ by zero
End

*/

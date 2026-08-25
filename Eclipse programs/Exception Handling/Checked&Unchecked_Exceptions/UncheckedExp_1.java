package in;

public class UncheckedExp_1 {
//In this program we have some lines of code which can give an Unchecked exception and its not handled to show that the compiler is not giving us any problem.
	public static void main(String[] args) {
		
		//An array with 5 elements.
		int[] arr = {1,2,3,4,5};  
		
		System.out.println(arr[90]);  //Accessing an element on index 90. This line will result in ArrayIndexOutOfBoundsException but it will not give us an immediate warning.
		//We have to handle it using try-catch blocks obviously to ensure smooth execution of program but compiler is not giving us any redline indication. 
		//The code will compile successfully.
	}
}


/*
 Output:
 
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 90 out of bounds for length 5
	at Exception_Handling/in.UncheckedExp_2.main(UncheckedExp_2.java:9)

 */

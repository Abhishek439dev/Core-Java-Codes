package singleton;
//Class imported to pass dates. LocalDate DOB = LocalDate.of(0, 0, 0)
import java.time.LocalDate;

public class User {

	public static void main(String[] args) {
		//Method called with className.methodName syntax and values are passed. The date value will be passed in its own syntax.
		//As the method is returning class object, we have to store it in some variable and its datatype will also be the class name (Non-primitive).
		AadharCard Ac1 =  AadharCard.createAdharCard(1234567890109L, LocalDate.of(1999, 02, 03), "Abhishek"); 

		//This line is printing the variable value using the object returned by the method, stored in the variable.
		System.out.println("Your Aadhar Card is under the regulatory guidelines of "+Ac1.companyName);
		System.out.println("------------------------------");

		//Some more methods are called to create the object but they are not allowed after one object creation.
		AadharCard.createAdharCard(1234567890123L, LocalDate.of(2000, 12, 04), "Honey");
		AadharCard.createAdharCard(1234567972834L, LocalDate.of(1998, 10, 10), "Ram");
	}
}

/*
 Output:
Aadhar Card created Successfully
Your id is 12345678
Your DOB is 2.1999
Your name is Abhishek
--------------------------
You can't have more than one Aadhar card.
You can't have more than one Aadhar card.

*/

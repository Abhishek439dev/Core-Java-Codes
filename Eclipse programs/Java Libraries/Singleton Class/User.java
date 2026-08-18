package singleton;

import java.time.LocalDate;

public class User {
	
	//LocalDate DOB = LocalDate.of(0, 0, 0)

	public static void main(String[] args) {
		
		AadharCard Ac1 =  AadharCard.createAdharCard(1234567890109L, LocalDate.of(1999, 02, 03), "Abhishek");
		System.out.println("Your Aadhar Card is under the regulatory guidelines of "+Ac1.companyName);
		System.out.println("------------------------------");
		AadharCard.createAdharCard(1234567890123L, LocalDate.of(2000, 12, 04), "Honey");
		AadharCard.createAdharCard(1234567972834L, LocalDate.of(1998, 10, 10), "Ram");
	}
}

/*
 
Aadhar Card created Successfully
Your id is 12345678
Your DOB is 2.1999
Your name is Abhishek
--------------------------
You can't have more than one Aadhar card.
You can't have more than one Aadhar card.

*/
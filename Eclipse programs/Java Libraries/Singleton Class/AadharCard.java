package singleton;
import java.time.LocalDate;   //This class is imported to print dates and take inputs in date format.

public class AadharCard {

	String companyName = "UIDAI";   //A variable whose value will be accessed in other class.
	private static AadharCard AC;  //private, static, non-primitive variable to store the object.

	//variables for constructor.
	long id;
	LocalDate DOB;
	String name;
	
	//private constructor to assign the variable values and display messages.
	private AadharCard(long id, LocalDate DOB, String name) {
		this.id = id;
		this.DOB = DOB;
		this.name = name;
		System.out.println("Aadhar Card created Successfully");
		System.out.println("Your id is "+this.id+"\nYour DOB is "+this.DOB+"\nYour name is "+this.name);
	}

	//public helper method which will be called to create the object. The return type of method is the class name as it is returning the class object.
	public static AadharCard createAdharCard(long id, LocalDate DOB, String name) {
		//condition to check if the variable has any object or is null.
		if(AC == null) {
			AC = new AadharCard(id, DOB, name);    //if its null, object is created.
		}
		else {
			System.out.println("You can't have more than one Aadhar card.");  //if object is already created, then this message will be displayed.
		}
		
		return AC;  //the method will return the object created stored in the reference (AC).
	}
}

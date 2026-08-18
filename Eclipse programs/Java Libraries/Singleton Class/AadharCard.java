package singleton;
import java.time.LocalDate;

public class AadharCard {

	String companyName = "UIDAI";
	private static AadharCard AC;
	
	long id;
	LocalDate DOB;
	String name;
	
	
	private AadharCard(long id, LocalDate DOB, String name) {
		this.id = id;
		this.DOB = DOB;
		this.name = name;
		System.out.println("Aadhar Card created Successfully");
		System.out.println("Your id is "+this.id+"\nYour DOB is "+this.DOB+"\nYour name is "+this.name);
	}
	
	public static AadharCard createAdharCard(long id, LocalDate DOB, String name) {
		if(AC == null) {
			AC = new AadharCard(id, DOB, name);
		}
		else {
			System.out.println("You can't have more than one Aadhar card.");
		}
		
		return AC;
	}
}

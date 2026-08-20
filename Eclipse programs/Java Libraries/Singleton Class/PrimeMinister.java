package singleton;

public class PrimeMinister {

	private static PrimeMinister PM;  //private static non-primitive variable to store the class object.
	String PMname = "Rahul Gandhi";  //

	//Private constructor: Prevents object creation in another class.
	private PrimeMinister() {
		System.out.println("Prime Minister got elected");  //message to print when invoked.
	}

	//public static helper method
	public static PrimeMinister electPM() {
		//condition to check if the refernce variable is storing an object already.
		if(PM == null) {
			PM = new PrimeMinister();   //if not create an object.
		}
		else {
			System.out.println("Prime Minister already elected.");  //if yes, object creation is not allowed.
		}
		
		return PM;  //returning the reference which is storing the object, so that we can access the variables of this class in another class.
	}
}

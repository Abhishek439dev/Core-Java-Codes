package singleton;

public class Elections {

	//main method where the execution will begin.
	public static void main(String[] args) {
		//Method called using className.methodName and as the method is returning a refernce we have to store it in a variable of classtype PrimeMinister.
		PrimeMinister PM = PrimeMinister.electPM();

		//accessing the variable of PrimeMinister class using the object reference returned by the method above and stored in variable PM.
		System.out.println("Your PM name is "+PM.PMname);
		System.out.println("----------------");

		//Trying to create more objects of the class but they will not be allowed.
		PrimeMinister.electPM();
		PrimeMinister.electPM();
		
	}
}

/*
Output :
Prime Minister got elected
Your PM name is Rahul Gandhi
----------------
Prime Minister already elected.
Prime Minister already elected.
*/

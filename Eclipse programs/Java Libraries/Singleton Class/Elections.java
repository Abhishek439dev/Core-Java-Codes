package singleton;

public class Elections {

	public static void main(String[] args) {
		PrimeMinister PM = PrimeMinister.electPM();
		System.out.println("Your PM name is "+PM.PMname);
		System.out.println("----------------");
		PrimeMinister.electPM();
		PrimeMinister.electPM();
		
	}
}

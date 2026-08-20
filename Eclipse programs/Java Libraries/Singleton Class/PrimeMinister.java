package singleton;

public class PrimeMinister {

	private static PrimeMinister PM;
	String PMname = "Rahul Gandhi";
	
	private PrimeMinister() {
		System.out.println("Prime Minister got elected");
	}
	
	public static PrimeMinister electPM() {
		if(PM == null) {
			PM = new PrimeMinister();
		}
		else {
			System.out.println("Prime Minister already elected.");
		}
		
		return PM;
	}
}

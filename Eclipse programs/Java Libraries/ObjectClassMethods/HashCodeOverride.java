package object;

public class HashCodeOverride {

	public int hashCode() {
		return 1234;
	}
	
	public static void main(String[] args) {
		HashCodeOverride HCO =new HashCodeOverride();
		
		System.out.println(HCO.hashCode());
	}
}

/*
1234
*/
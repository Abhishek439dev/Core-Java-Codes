package object;
//In this program we have overridden the hashCode method to return a differnt integer value instead of the hashcode.
public class HashCodeOverride {

	@Override
	public int hashCode() {
		return 1234;
	}
	
	public static void main(String[] args) {
		HashCodeOverride HCO =new HashCodeOverride();
		
		System.out.println(HCO.hashCode());
	}
}

/*
Output:
1234
*/

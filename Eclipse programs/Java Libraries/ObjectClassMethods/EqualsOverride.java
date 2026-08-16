package object;

public class EqualsOverride {

	int id;
	String name;
	
	EqualsOverride(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		EqualsOverride E = (EqualsOverride) obj;
		return this.id == E.id && this.name == E.name;
	}
	
	
	public static void main(String[] args) {
		
		EqualsOverride EQ1 = new EqualsOverride(101, "Ram");
		EqualsOverride EQ2 = new EqualsOverride(101, "Ram");
		
		System.out.println(EQ1 == EQ2);       //false
		System.out.println(EQ1.equals(EQ2));  //true
		
	}
}

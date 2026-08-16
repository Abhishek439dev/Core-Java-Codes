package object;
//We can override the equals method to compare the actual content of the objects instead of their hashcode values.
public class EqualsOverride {

	//Variables
	int id;
	String name;

	//Constructor created as we have to compare the values in the objects. Those values need to be passed, hence a const. is required.
	EqualsOverride(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {                 //Object is the superclass thus the subclass object gets assigned to a superclass reference i.e. Upcasting.
		EqualsOverride E = (EqualsOverride) obj;         //downcasting.
		return this.id == E.id && this.name == E.name;   //this.id and this.name ---> EQ1 and E.id and E.name ----> EQ2
	}
	
	
	public static void main(String[] args) {
		//Objects created with arguments so that we can compare their values.
		EqualsOverride EQ1 = new EqualsOverride(101, "Ram");
		EqualsOverride EQ2 = new EqualsOverride(101, "Ram");
		
		System.out.println(EQ1 == EQ2);       //false: Called equals method with default implementation.
		System.out.println(EQ1.equals(EQ2));  //true: Overrided method called.
		
	}
}

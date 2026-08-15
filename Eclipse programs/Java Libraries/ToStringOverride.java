package object;

public class ToStringOverride {
	String name;  //Member variable declared.

	//Constructor declared.
	public ToStringOverride(String name) {
		this.name = name;
	}

	//toString method is overriden to return the value which is passed to the constructor while object creation.
	@Override
	public String toString() {
		return name;   //or this.name;
	}
	
	public static void main(String[] args) {
		//Objects created and value is passed as constructor is accepting String values.
		ToStringOverride TSO1 = new ToStringOverride("Tom");
		ToStringOverride TSO2 = new ToStringOverride("Jerry");
		
		//the object references are printed.
		System.out.println(TSO1);
		System.out.println(TSO2);
	}
}

/*
Output:
Tom
Jerry
*/

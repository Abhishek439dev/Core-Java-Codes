package in;

public class CCE {

	//ClassCastException (CCE) takes place when we upcast a class but downcast to a different class.
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Father f = new Son(); //upcasting the son class.
		Daughter d = (Daughter) f; //downcasting to the daughter class. The program execution will terminate here with ClassCastException.
		
		System.out.println("End");

	}
}

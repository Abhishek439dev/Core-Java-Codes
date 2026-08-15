package object;
//This is a method of Object class which returns the String representation of an object. 
public class ToString {

	public static void main(String[] args) {
		
		ToString Ts = new ToString(); // An Object of class is created.
		System.out.println(Ts);  //String Representation = Fully Qualified Class Name@ Hexadecimal value of HashCode.
		System.out.println(Ts.toString());  //Explicitly called.
	}
}

/*
Result:
object.ToString@65b3120a
object.ToString@65b3120a
*/

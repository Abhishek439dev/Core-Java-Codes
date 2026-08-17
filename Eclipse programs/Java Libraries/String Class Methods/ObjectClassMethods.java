package string;
//Like all classes the String class also inherits the Object class. But in String class the methods of Object class are already overriden to perform different actions.
public class ObjectClassMethods {

	public static void main(String[] args) {
		
		String s = new String("Hello world");    //String object created.

		//the toString() method returns the actual content of the object instead of its String Representation in String class.
		System.out.println(s);                   //Printing object reference (calling toString() method implicitly). Output: "Hello world"
		System.out.println(s.toString());        //Calling toString method explicitly. Output: "Hello world" 
		
		System.out.println("---------------------");

		//the hashCode() method returns an ASCII value of the given string in the String object instead of the hashcode value in String class.
		String s1 = new String("A");    
		System.out.println(s1.hashCode());        //Output: 65 (ASCII value of A).
		
		System.out.println("---------------------");

		//the equals() method in String class compares the actual content in the String objects instead of their hashcode values.
		String s2 = new String("Abhishek");
		String s3 = new String("Abhishek");
		System.out.println(s2.equals(s3));    //true
		System.out.println(s2 == s3);         //false --> as the '==' operator calls the default unmodified equals method.
		
		System.out.println("---------------------");
		
		
		
	}
}

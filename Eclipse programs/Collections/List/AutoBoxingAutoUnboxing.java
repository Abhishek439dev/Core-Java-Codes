package list;
//The conversion of primitive data types to non-primitive data types is called as AutoBoxing and its opposite is called as AutoUnBoxing.
//Both these processes take place automatically. The collections use non-primitive data types or wrapper classes only.
public class AutoBoxingAutoUnboxing {

	public static void main(String[] args) {
		
		//===AutoBoxing===
		int a = 10;                 //primitive data type int.

		//primitive data type converting to non-primitive.
		Integer b = new Integer(a);  //Deprecated way  
		
		Integer i = a;               //New way : Simple assigning without using the new keyword.
		
		System.out.println(a+" "+b+" "+i);  //10 10
		
		//====AutoUnBoxing====
		//Depreceated way.
		Character c = new Character('A'); //Non-primitive data type storing 'A'.
		char ch = c;                      // converted to Primitive data type.
		
		//New way : Simple assigning without using the new keyword.
		Character C = 'B';           	  //Non-primitive data type storing 'B'.
		char CH = C;                      // converted to Primitive data type.
		
		System.out.println(c+" "+ch+" "+CH);  //A A B
	}
}

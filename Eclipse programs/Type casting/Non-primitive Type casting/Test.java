package in;

public class Test {

	public static void main(String[] args) {
		
		//Specialization: You can access properties of only one class with its object (along with super class Father properties). 
		Son s = new Son();
		System.out.println("Son's Age "+s.sonAge+" "+"Son's Name "+s.sNAme);  
		
		Daughter d = new Daughter();
		System.out.println("Daughter's Age "+d.dAge+" "+"Daughter's Name "+d.dName);
		
		//We can't access properties of both the sibling classes by the object-creation of any one of these sub-classes.
		
		Father f = new Son();      //This is upcasting. The reference 'f' is storing an object of the Son class.
		Son s1 = (Son) f;          //Downcasting to son's object. 
		System.out.println("Son's Age "+s1.sonAge+" "+"Son's Name "+s1.sNAme+" "+"Father's age "+s1.FatherAge+" "+"Father's Name "+s1.FName);
		
		Father f1 = new Daughter();
		Daughter d1 = (Daughter) f1;   //Downcasting to daughter's object.
		System.out.println("Daughter's Age "+d1.dAge+" "+"Daughter's Name "+d1.dName+" "+"Father's age "+s1.FatherAge+" "+"Father's Name "+s1.FName);
		
	}
}

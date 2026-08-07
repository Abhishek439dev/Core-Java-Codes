package org;

//IS-A relationship
public class Son extends Father{

	//subclass constructor
	Son(){
		super(50, "JM Saxena");                                //super calling statement used explicitly to call the superclass const. 
		System.out.println("This is Son's constructor");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();                                     //object creation of concrete subclass to invoke its constrcutor. 
		System.out.println("Father's age is "+s.fAge+" and his name is "+s.fName);  //Accessing variables initialized by superclass const.
	}
}


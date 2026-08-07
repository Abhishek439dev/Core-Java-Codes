package org;

public class Son extends Father{

	int sAge;
	String sName;
	
	Son(){
		super(50, "JM Saxena");
		System.out.println("This is Son's constructor");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		System.out.println("Father's age is "+s.fAge+" and his name is "+s.fName);
	}
}


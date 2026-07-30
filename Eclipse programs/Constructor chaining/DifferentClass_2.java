package com;

//Is-A relationship is required to achieve constructor calling.
public class DifferentClass_2 extends DifferentClass_1{

	DifferentClass_2(){   //This constructor from child class will call the non-parameterized const. of parent class automatically upon its object-creation.
		System.out.println("This constructor will call the non-parameterized const. of first class implicitly.");
	}
	
	DifferentClass_2(int a, String b){  //This constructor from child class will not call the parameterized const. of parent class automatically, super() is required.
		super(a, b);                    //super() must be written in the first line under the calling constructor.
		System.out.println("This constructor will call the paremeterized const. of first class explicitly");
	}
	
	public static void main(String[] args) {
		new DifferentClass_2();                  //object-creation for invoking the first constructor. 
		System.out.println("___________");
		new DifferentClass_2(24, "Tom");        //pbject-creatoin to invoke the second constructor.
		
	}
}

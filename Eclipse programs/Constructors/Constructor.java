package com;

//Constructors are a set of instructions used for initialization and object creation.
public class Constructor {
 
	int age;                //non-static global variables
	String name;
	
	Constructor(int age, String name){     //Name of constructor should be same as of class, there should be no return type. 
		this.age = age;                    //As the names of parameters of constructor are same as of global variables, 'this' keyword is used to target the-
		this.name = name;                  //- global Properties of current object.
	}
	
	public static void main(String[] args) {
		Constructor p1 = new Constructor(20, "Tom");          //Object creation leads to constructor calling. Arguments are passed b/c constructors have parameters.
		Constructor p2 = new Constructor(21, "Ben");
		
		System.out.println("Person 1 age is "+p1.age+" and his name is "+p1.name);  //Display of results.
		System.out.println("Person 2 age is "+p2.age+" and his name is "+p2.name);
	}
}

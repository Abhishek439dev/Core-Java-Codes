package com;

public class Const_Simplified {
	 
		int age;                //non-static global variables
		String name;
		int salary;
		
		Const_Simplified(int age, String name, int salary){     //Name of constructor should be same as of class, there should be no return type. 
			this.age = age;                    //As the names of parameters of constructor are same as of global variables, 'this' keyword is used to target the-
			this.name = name;                  //- global Properties of current object.
			this.salary = salary;
		}
		
		void ResultDisplay() {
			System.out.println("Person age is "+this.age+" his name is "+this.name+" and his salary is "+this.salary); //Method to display the results.
		}
		
		public static void main(String[] args) {
			Const_Simplified p1 = new Const_Simplified(20, "Tom", 45000);   //Object creation leads to constructor calling. Arguments are passed b/c constructors have parameters.
			Const_Simplified p2 = new Const_Simplified(21, "Ben", 40000);
			
		p1.ResultDisplay();   //Instead of writing complex print statements for each object we can just call the method for each object.
		p2.ResultDisplay();
		}
	}


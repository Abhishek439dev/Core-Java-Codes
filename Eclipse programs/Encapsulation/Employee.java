package com;
//Java Bean Class is the best example for Encapsulation. 
public class Employee {       //Class should be public non-abstract class.
	
	private int age;          //All the variables must have private variables in a Java Bean Class.
	private String EmpName;
	
	public void setAge(int age) {               //All private variables should have their public setter and getter methods.
		if(age>0) {                                       //We can add conditions to validate the passed data before initializing it to the variables.
			System.out.println("Age initialized to:");
			this.age = age;
		}
		else {
			System.out.println("Enter a valid age");
		}	
	}
	
	public int getAge() {                      //Public getter method for age variable.
		return age;
	}
	
	public void setEmpName(String empName) {   //Public setter method for EmpName variable.
		this.EmpName = empName;
	}
	
	public String getEmpName() {              //Public getter method for EmpName variable.
		System.out.println("Your name is:");
		return EmpName;
	}
		
	
	

}

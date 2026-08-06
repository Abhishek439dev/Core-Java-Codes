package com;

//Is-A relationship from class to interface using implements keyword.
public class Logic implements Calculator {

	//overriding the methods inherited from the Calculator interface by providing them an implementation as per their function.
	@override
	public int add(int a, int b) {
		return a+b;
	}
	@override
	public int sub(int a, int b) {
		return a-b;
	}
	@override
	public int multiply(int a, int b) {
		return a*b;
	}
	@override
	public int divide(int a, int b) {
		return a/b;
	}
	@override
	public void exit() {
		System.exit(0);   //This command is used to terminate the program. 0 -> successful termination, 1 -> runtime exception, 2-> syntax error, -1 -> external error
	}

}

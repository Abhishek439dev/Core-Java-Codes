package com;

//Created an interface
public interface Calculator {

	//interface only stores public and abstract methods(no need to declare them as public and abstract) by default.
	int add(int a, int b);                  //addition method.
	int sub(int a, int b);                  //subtraction method.
	int multiply(int a, int b);             //multiplication method.
	int divide(int a, int b);               //division method.
	void exit();                            //exit method.
	
}

package com;

public class NonStatic {
	//variables or methods with no static keyword are called non-static.
	int age = 10;
	
	void display(int a) {
		System.out.println(a);
	}
	
    public static void main(String[] args) {
		NonStatic Obj = new NonStatic(); //Non-static properties requires object creation to use.
		
		System.out.println(Obj.age);   //ObjectName.Non-static property name.
		Obj.display(4);
	}
}

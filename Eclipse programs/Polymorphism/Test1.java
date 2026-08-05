package com;

public class Test1 {
	
	void invokeStart(Vehicle V) {
		V.start();                    //new ClassObject.start();
	}

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.invokeStart(new Vehicle());
		
		t1.invokeStart(new Car());
		
		t1.invokeStart(new Bike());
		
		
	}
}

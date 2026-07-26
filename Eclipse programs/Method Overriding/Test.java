package com;

public class Test {

	public static void main(String[] args) {
		
		Instagram_v3 IGv3 = new Instagram_v3();    //Object of the latest class is created.

		//All the methods are called. We are calling the latest or overrided methods in the Instagram_v3 class and these methods are written such that they will-
		//call their previous versions before executing the current version, so we will get their outputs in a sequence.
		IGv3.upload();                             
		System.out.println("_________________");
		IGv3.DM();
		System.out.println("_________________");
		IGv3.Story();
	}
}

package org;

public class ThrowableMethods {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");
	}
}

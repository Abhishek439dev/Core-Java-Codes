package com;

public class Instanceof {

	public static void main(String[] args) {
		
		System.out.println(new Mobile() instanceof Mobile);
		System.out.println(new Laptop() instanceof Laptop);
		System.out.println(new Electronics() instanceof Electronics);
		
		System.out.println("------------------------------------");
		
		System.out.println(new Mobile() instanceof Electronics);
		System.out.println(new Laptop() instanceof Electronics);
		
		System.out.println("------------------------------------");
		
		System.out.println(new Electronics() instanceof Mobile);
		System.out.println(new Electronics() instanceof Laptop);
	}
}

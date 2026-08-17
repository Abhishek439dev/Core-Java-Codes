package string;

public class StringClassConstructors {

	public static void main(String[] args) {
		
		//Passing set of characters to the String.
		String s = new String("Hello there!");
		System.out.println(s);        //Hello there!

		//Empty representation of a String object. Its equivalent to declaring an empty String. (String name = "";)
		String s1 = new String("");
		System.out.println(s1);       //blank output.

		//Passing a char[] array to the String object which converts into a String.
		char[] a = {'A','b','h','i','s','h','e','k'};  //array
		String s2 = new String(a);    //passing the array as String object
		System.out.println(s2);       //Abhishek
		
		}
		
	}

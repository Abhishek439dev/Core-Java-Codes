package string;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Software Developer";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("-----------------------");
		System.out.println(s.startsWith("Soft"));
		System.out.println(s.startsWith("soft"));
		System.out.println("-----------------------");
		System.out.println(s.endsWith("per"));
		System.out.println(s.endsWith("ware"));
		System.out.println("-----------------------");
		System.out.println(s.contains("eve"));
		System.out.println(s.contains("ware"));
		System.out.println("-----------------------");
		System.out.println(s.concat(" at Google"));
		System.out.println("-----------------------");
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(0));
		System.out.println("-----------------------");
		System.out.println(s.indexOf("f"));
		System.out.println(s.indexOf("e"));
		System.out.println("-----------------------");
		String a = "Java";
		String b = "java";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println("-----------------------");
		System.out.println(s.substring(5));
		System.out.println(s.substring(4, 8));
		
		
		
		
		
	}
}

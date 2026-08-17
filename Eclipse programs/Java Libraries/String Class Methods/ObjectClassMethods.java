package string;

public class ObjectClassMethods {

	public static void main(String[] args) {
		
		String s = new String("Hello world");
		System.out.println(s);
		System.out.println(s.toString());
		
		System.out.println("---------------------");
		
		String s1 = new String("A");
		System.out.println(s1.hashCode());
		
		System.out.println("---------------------");
		
		String s2 = new String("Abhishek");
		String s3 = new String("Abhishek");
		System.out.println(s2.equals(s3));
		
		System.out.println("---------------------");
		
		
		
	}
}

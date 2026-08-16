package object;

public class Equals {

	public static void main(String[] args) {
		Equals e1 = new Equals();
		Equals e2 = new Equals();
		
		System.out.println(e1 == e2);       //false
		System.out.println(e1.equals(e2));  //false
	}
}

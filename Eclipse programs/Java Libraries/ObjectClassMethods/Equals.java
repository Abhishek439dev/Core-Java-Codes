package object;
//This method returns a boolean value after comparing the hascode values of the two objects.
public class Equals {

	public static void main(String[] args) {
		Equals e1 = new Equals();
		Equals e2 = new Equals();

		//it can be called in two ways i) by using == equal operator ii) by using the equals method calling statement.
		//hashcode of no two objects can be same.
		System.out.println(e1 == e2);       //false
		System.out.println(e1.equals(e2));  //false
	}
}

package vector;

import java.util.Vector;

public class VectorDemo {

	int age;
	String name;
	char gender;
	
	public VectorDemo(int age, String name, char gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}


	public String toString() {
		return "The Student "+name+" is "+age+" years old "+"and this student is "+gender+".";
	}

	public static void main(String[] args) {
		
		VectorDemo s1 = new VectorDemo(20, "Shasha", 'F');
		VectorDemo s2 = new VectorDemo(22, "Connie", 'M');
		VectorDemo s3 = new VectorDemo(21, "Levi Ackerman", 'M');
		VectorDemo s4 = new VectorDemo(24, "Eren Yeager", 'M');
		VectorDemo s5 = new VectorDemo(19, "Mikasa Ackerman", 'F');
		
		Vector<VectorDemo> vc = new Vector<VectorDemo>();
		
		vc.add(s1);
		vc.add(s2);
		vc.add(s3);
		vc.add(s4);
		vc.add(s5);
		
		for(Object o : vc) {
			System.out.println(o);
		}
		
		
		
	}
}

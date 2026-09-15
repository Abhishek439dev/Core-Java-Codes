package list;

public class AutoBoxingAutoUnboxing {

	public static void main(String[] args) {
		
		//AutoBoxing
		
		int a = 10;
		Integer b = new Integer(a);  //Deprecated way
		Integer i = a;               //New way
		
		System.out.println(a+" "+b+" "+i);
		
		//AutoUnBoxing
		
		Character c = new Character('A'); //Deprecated way
		char ch = c;
		
		Character C = 'B';  //New way
		char CH = C;
		
		System.out.println(c+" "+ch+" "+CH);
	}
}

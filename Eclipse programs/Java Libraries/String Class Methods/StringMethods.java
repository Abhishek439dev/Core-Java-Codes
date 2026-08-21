package string;
//String class offeres a number of pre-defined methods.
public class StringMethods {

	public static void main(String[] args) {
		String s = "Software Developer";
		
		System.out.println(s.toUpperCase());             //SOFTWARE DEVELOPER
		System.out.println(s.toLowerCase());             //software developer
		System.out.println("-----------------------");
		System.out.println(s.startsWith("Soft"));        //true
		System.out.println(s.startsWith("soft"));        //false
		System.out.println("-----------------------");
		System.out.println(s.endsWith("per"));           //true 
		System.out.println(s.endsWith("ware"));          //false
		System.out.println("-----------------------");
		System.out.println(s.contains("eve"));           //true
		System.out.println(s.contains("ware"));          //true
		System.out.println("-----------------------");
		System.out.println(s.concat(" at Google"));      //Software Developer at Google.
		System.out.println("-----------------------");
		System.out.println(s.charAt(5));                 //a
		System.out.println(s.charAt(0));                 //S
		System.out.println("-----------------------");
		System.out.println(s.indexOf("f"));              //2
		System.out.println(s.indexOf("e"));              //7
		System.out.println("-----------------------");
		String a = "Java"; 
		String b = "java";
		System.out.println(a.equals(b));                 //false
		System.out.println(a.equalsIgnoreCase(b));       //true
		System.out.println("-----------------------");
		System.out.println(s.substring(5));              //are Developer
		System.out.println(s.substring(4, 8));           //ware 
		
		String x = "Java";
		char[] ch = x.toCharArray(); //converts a String to an array of characters.
		
		for(int i = 0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");  //J a v a
		}
		
		
		
	}
}

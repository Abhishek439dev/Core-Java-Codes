package in;

import java.io.FileReader;
//This program shows another checked exception example which is handled using suitable try-catch block.
public class CheckedExp_3 {

	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("demo.txt");   //this line of code can give a "FileNotFoundException", if the given file is not present. If we don't handle it, the compiler will show redline under the code.
		}
		catch(Exception e) {
			System.out.println("file not found");
		}
	}
}

package in;

public class CheckedExp_1 {
//In this program we have a Checked exception and it is not handled to show how the compiler is indicating us of a possible exception.
	
	public static void main(String[] args) {
		//loop to print numbers from 1 to 5.
		for(int i =1; i<=5; i++) {
			System.out.println(i);
			
	//This line can give InterruptedException and the compiler is letting us know by indicating a redline below the code line. This line of code
	//will not be compiled until it is handled via try-catch.
			Thread.sleep(2000);  //This function prints the next number with a delay of 2 seconds.
		}
	}
}

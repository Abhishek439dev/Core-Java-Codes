package in;

public class CheckedExp_2 {
//This program shows a checked exception and we have handled it as it should be using the try-catch blocks to ensure proper execution of program.
	public static void main(String[] args) {
		//Printing numbers from 1 to 5.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			//Handling the critical code using try-catch.
			try {
				Thread.sleep(2000); // this method prints the next iteration with a delay of 2 seconds. (We can't run the program without handling this line.)
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

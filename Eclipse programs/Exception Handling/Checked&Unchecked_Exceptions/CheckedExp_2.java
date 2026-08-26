package in;

public class CheckedExp_2 {
//This program shows a checked exception and we have handled it as it should be using the try-catch blocks to ensure proper execution of program.
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			//Handling the critical code using try-catch.
			try {
				Thread.sleep(2000); // this method prints the next iteration with a delay of 2 seconds.
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

package customExp;
//This custom exception class is inheriting the Exception superclass that's why it will act as a Checked exception and we have to handle it immediately.
public class InsufficientBalanceException extends Exception{

	private static final long serialVersionUID = 1L;     //serial value of the custom exception class.
	
	private String message;   //A private variable to display the short message of exception.

	//Public constructor to accept the 'exception short message' via object creation and initializing the private variable.
	public InsufficientBalanceException(String message) {
		this.message = message;
	}

	//Creating a public method to return the initialized value of private variable but it involved Overriding the getMessage() method of Throwable class. 
	@Override
	public String getMessage() {
		return message;
	}
}

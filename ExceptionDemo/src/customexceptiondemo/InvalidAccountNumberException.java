package customexceptiondemo;

public class InvalidAccountNumberException extends Exception {
	
	/**
	 * This will create InvalidAccountNumberException object without error message
	 */
	public InvalidAccountNumberException() {
		super();
	}
	/**
	 * This will create InvalidAccountNumberException object with error message
	 */
	public InvalidAccountNumberException(String errMsg) {
		super(errMsg);
	}

}

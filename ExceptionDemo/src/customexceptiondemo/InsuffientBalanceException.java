package customexceptiondemo;

public class InsuffientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This will create InsuffientBalanceException object without error message
	 */
	public InsuffientBalanceException() {
		super();
	}
	/**
	 * This will create InsuffientBalanceException object with error message
	 */
	public InsuffientBalanceException(String errMsg) {
		super(errMsg);
	}
}

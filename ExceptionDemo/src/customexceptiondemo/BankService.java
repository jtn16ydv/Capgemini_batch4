package customexceptiondemo;

public class BankService {

	private int balance = 5000;
	
	public void withdraw(int accNo, int amount) throws InvalidAccountNumberException, InsuffientBalanceException {
		
		if(accNo!=101) {
			throw new InvalidAccountNumberException("Your Account Number is not Valid");
		}
		
		else if(amount>balance) {
			throw new InsuffientBalanceException("Balance is less than amount to be withdrawn");
		}
		else {
			System.out.println("Current balance : "+balance);
			balance=balance-amount;
			System.out.println("Available balance : "+balance);
			System.out.println("Amount withdrawn from  : "+accNo);
			System.out.println("Amount withdrawn : "+amount);
		}
		
		
		
	}
}

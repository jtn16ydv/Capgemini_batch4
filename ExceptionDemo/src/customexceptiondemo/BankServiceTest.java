package customexceptiondemo;

public class BankServiceTest {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		try {
			bankService.withdraw(100, 20000);
		} catch (InvalidAccountNumberException e) {
			System.out.println(e.getMessage());
		} catch (InsuffientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}

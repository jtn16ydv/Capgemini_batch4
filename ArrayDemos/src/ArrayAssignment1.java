import java.util.Scanner;

public class ArrayAssignment1 {
	private static int CAPACITY=10;

	public static void main(String[] args) {
		int [] numbers = new int[CAPACITY];
		Scanner scanner = new Scanner(System.in);
		int choice;
		String continueChoice;
		
		do {
			showMenu();
			System.out.println("Enter your choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				//TODO :  Work for Add
				// in case adding more value than capacity, will throw the ArrayIndexOutOfBoundsException
				// Manage your program in such a way so that it should never throw ArrayIndexOutOfBoundsException, and it should allow you to add as many numbers as you want
				break;
			case 2:
				//TODO :  Work for Show
				//Output must be in values = [200,150] format
				break;
			case 3:
				//TODO :  Work for Replace
				break;
			case 4:
				//TODO :  Work for Sorting
				break;
			case 5:
				//TODO :  Work for Searching
				break;

			default:
				//TODO: Show default error message
				break;
			}
			System.out.println("Do You want to continue : (yes/no) : ");
			continueChoice=scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
		

	}

	private static void showMenu() {
		System.out.println("-------Array Operations--------");
		System.out.println("1. Add");
		System.out.println("2. Show");
		System.out.println("3. Replace");
		System.out.println("4. Sort");
		System.out.println("5. Search");
		
		
	}

}

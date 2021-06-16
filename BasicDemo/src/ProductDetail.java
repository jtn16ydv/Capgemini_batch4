import java.util.Scanner;
public class ProductDetail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Project Name:");
		String projectName = scanner.next();
		System.out.println("Sr#\t ProductName \t MRP \t Selling Price \t Discount");
		System.out.println("-----------------------------------------------------------");
		System.out.println("1 \t"+projectName+"");
		scanner.close();
		
		

	}

}

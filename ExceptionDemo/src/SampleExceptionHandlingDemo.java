
public class SampleExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("--------main: Line First--------");
		
			try {
				int a=10/0;
				System.out.println(a);
				
			}catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		
		System.out.println("--------main: Line Last--------");

	}

}

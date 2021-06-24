
public class MethodStackDemo {

	public static void main(String[] args) {
		System.out.println("--------main: Line First--------");
		method1();
		System.out.println("--------main: Line Last--------");
	}

	private static void method1() {
		System.out.println("--------method1: Line First--------");
		try {
			method2();
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--------method1: Line Last--------");
		
	}

	private static void method2() {
		System.out.println("--------method2: Line First--------");
		int a = 10/0;
		System.out.println("Result : "+a);
		System.out.println("--------method2: Line Last--------");
		
	}

}

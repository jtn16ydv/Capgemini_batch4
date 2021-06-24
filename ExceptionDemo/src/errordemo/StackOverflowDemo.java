package errordemo;

public class StackOverflowDemo {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		method1();		
	}

}

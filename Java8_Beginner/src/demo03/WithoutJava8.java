package demo03;

public class WithoutJava8 {

	public static void main(String[] args) {
		Greeting morningGreeting = () -> System.out.println("Good Morning");

		Greeting eveningGreeting = () -> System.out.println("Good Evening");

		morningGreeting.greet();
		eveningGreeting.greet();

	}

}

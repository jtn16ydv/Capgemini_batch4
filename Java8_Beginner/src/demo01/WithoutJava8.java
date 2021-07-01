package demo01;

public class WithoutJava8 {

	public static void main(String[] args) {
		Greeting greeting;
		greeting=new MorningGreeting();
		greeting.greet();
		greeting=new EveningGreeting();
		greeting.greet();

	}

}

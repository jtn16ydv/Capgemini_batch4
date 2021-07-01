package demo02;

public class WithoutJava8 {

	public static void main(String[] args) {
		Greeting morningGreeting=new Greeting() {
			
			@Override
			public void greet() {
				System.out.println("Good Morning");
				
			}
		};
		Greeting eveningGreeting=new Greeting() {
			
			@Override
			public void greet() {
				System.out.println("Good Evening");
				
			}
		};
		morningGreeting.greet();
		eveningGreeting.greet();
		
	}

}

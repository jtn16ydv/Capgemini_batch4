package demo03;

public class PracticalLambdaDemo {

	public static void main(String[] args) {
		Runnable target= ()-> {
				String name = Thread.currentThread().getName();
				for (int i = 1; i <=10; i++) {
					System.out.println(name+":"+i);
				}
				
			};
		
		Thread thread1 = new Thread(target);
		Thread thread2 =  new Thread(target);
		thread1.setName("Arzoo");
		thread2.setName("Manish");

		thread1.start();
		thread2.start();
	}

}

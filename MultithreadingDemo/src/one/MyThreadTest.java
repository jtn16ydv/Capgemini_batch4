package one;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread harshThread= new MyThread();
		MyThread arzooThread= new MyThread();
		
		harshThread.setName("Harsh");
		arzooThread.setName("Arzoo");
		
		harshThread.start();
		arzooThread.start();
		harshThread.start();

	}

}

package two;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread target = new MyThread();
		
		Thread harshThread=new Thread(target);
		Thread arzooThread = new Thread(target);
		
		harshThread.setName("Harsh");
		arzooThread.setName("Arzoo");
		
		harshThread.start();
		arzooThread.start();
		

	}

}

package one;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		String threadName= Thread.currentThread().getName();
		task(threadName);
	}

	private void task(String threadName) {
		for (int i = 1; i <=10; i++) {
			System.out.println(threadName+":"+i);
		}
	}

}

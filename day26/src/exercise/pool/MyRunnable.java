package exercise.pool;

public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("我需要一位教练");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("教练来了"+Thread.currentThread().getName());
		System.out.println("再见教练");
	}
}

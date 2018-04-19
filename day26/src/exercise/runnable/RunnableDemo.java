package exercise.runnable;

public class RunnableDemo implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"线程正在执行！"+i);
		}
	}
}

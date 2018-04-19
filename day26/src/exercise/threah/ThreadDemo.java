package exercise.threah;

public class ThreadDemo extends Thread {
	public ThreadDemo(String name) {
		super();
	}
	

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+"：正在执行！"+i);
		}
	}
}

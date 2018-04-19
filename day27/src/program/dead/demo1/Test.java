package program.dead.demo1;

public class Test {
	public static void main(String[] args) {
		//创建线程任务对象
		ThreadTask task = new ThreadTask();
		
		//创建两个线程对象
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		//启动线程
		t1.start();
		t2.start();
	}
}

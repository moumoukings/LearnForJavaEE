package exercise.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
	public static void main(String[] args) {
		//创建线程池对象
		ExecutorService service = Executors.newFixedThreadPool(2);
		//创建Runnable实例对象
		MyRunnable mr = new MyRunnable();
		//创建对象方式
		Thread t = new Thread(mr);
		t.start();
		
		//从线程池中获取线程对象，然后调用MyRunnable中的run()
		service.submit(mr);
		service.submit(mr);
		service.submit(mr); 
		
	}
}

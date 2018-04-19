package exercise.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
	public static void main(String[] args) {
		//创建线程池对象
		ExecutorService service = Executors.newFixedThreadPool(2);
		//创建Callable实例对象
		MyCallable mc = new MyCallable();
		
		//从线程池中获取线程对象，然后调用MyCallable中的run()
		service.submit(mc);
		service.submit(mc);
		service.submit(mc);
	}
}

package exercise.pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

	public Object call() throws Exception {
		System.out.println("我要一个教练:");
		Thread.sleep(2000);
		System.out.println("教练来了： " +Thread.currentThread().getName());
		System.out.println("教我游泳,教完后,教练回到了游泳池");
		return null;
	}
	
}

package exercise.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
	public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(2);
		//创建子类对象
		GetSumCallable gsc1 = new GetSumCallable(2,3);
		GetSumCallable gsc2 = new GetSumCallable(4,6);
	
		//提交接口子类对象
		Future<Integer> result = service.submit(gsc1);
		Integer sum = result.get();
		System.out.println("sum"+" "+sum);
		
		Future<Integer> result1 = service.submit(gsc2);
		Integer sum1 = result1.get();
		System.out.println("sum"+" "+sum1);
		
		service.shutdown();
	}
}

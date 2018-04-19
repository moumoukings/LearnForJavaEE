package program;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 使用多线程技术
 * 	两个线程：一个计算1+...+100;一个计算1+...+200
 */
public class ThreadPoolDemo {
	public static void main(String[] args) throws Exception, ExecutionException {
		//创建线程池对象
		ExecutorService es = Executors.newFixedThreadPool(2);
		//提交接口子类对象(创建子类对象)
		Future<Integer> f1 = es.submit(new GetSumCallable(100));
		System.out.println(f1.get());
		System.out.println("==========");
		Future<Integer> f2 =es.submit(new GetSumCallable(200));
		System.out.println(f2.get());
	}
}

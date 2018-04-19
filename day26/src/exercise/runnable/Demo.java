package exercise.runnable;

public class Demo {
	public static void main(String[] args) {
		//创建线程对象
		RunnableDemo rd = new RunnableDemo();
		//将接口子类对象传递给Thread类的构造函数
		Thread tr1 = new Thread(rd);
		Thread tr2 = new Thread(rd);
		//开启线程
		tr1.start();
		tr2.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("main线程:"+i);
		}
	}
}

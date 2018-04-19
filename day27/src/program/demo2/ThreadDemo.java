package program.demo2;

public class ThreadDemo {
	public static void main(String[] args) {
		//创建对象
		Ticket t = new Ticket();
		
		//创建三个窗口
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}

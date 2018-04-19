package program.demo2;

/*同步代码块格式：
	synchronized(锁对象) {可能产生线程安全隐患的 问题代码}
	
	锁对象：任意对象
	*/

public class Ticket implements Runnable {
	int ticket = 100;
	Object obj = new Object();
	//模拟卖票(此时线程安全，使用同步代码块解决)
	public void run() {
		while(true) {
			synchronized (obj){
				if( ticket > 0) {
					try {					
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在售票:"+ticket--);
				}
			}
		}
	}
	
}

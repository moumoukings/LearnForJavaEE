package program.demo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
 * 
 */
public class Ticket implements Runnable {
	int ticket = 100;
	
	//创建所对象
	Lock lock = new ReentrantLock();
	
	//模拟卖票(此时线程安全，使用JDK1.5特性：Lock接口方法解决)
	public void run() {
		while(true) {
			//启动锁
			lock.lock();
			
			if( ticket > 0) {
				try {					
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					//释放锁
					lock.unlock();
				}
				System.out.println(Thread.currentThread().getName()+"正在售票:"+ticket--);
			}			
		}
	}	
}

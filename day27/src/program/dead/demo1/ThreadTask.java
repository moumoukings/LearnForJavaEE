package program.dead.demo1;

import java.util.Random;

public class ThreadTask implements Runnable {
	//随机0和1
	int x = new Random().nextInt(1);
	
	public void run() {
		while(true) {
			if(x%2 == 0) {
				synchronized(Mylock.lockA) {
					System.out.println("我是if里面的A锁");
					synchronized(Mylock.lockB) {
						System.out.println("我是if里面的B锁");						
					}
				}
			}else {
				synchronized(Mylock.lockB) {
					System.out.println("我是else里面的B锁");
					synchronized(Mylock.lockA) {
						System.out.println("我是else里面的A锁");
					}
				}
			}
			x++;
		}
	}
}

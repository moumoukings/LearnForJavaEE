package program.demo1;

public class Ticket implements Runnable {
	int ticket = 100;
	
	//模拟卖票(此时线程不安全，存在安全隐患)
	public void run() {
		while(true) {
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

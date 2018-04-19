package program.demo3;

/*同步代码块格式：
	public synchronized void method(){
   			可能会产生线程安全问题的代码
		}
	*/

public class Ticket implements Runnable {
	int ticket = 100;
	
	//模拟卖票(此时线程安全，使用同步方法解决)
	public void run() {
		while(true) {
			method();
		}
	}
	
	public synchronized void method(){
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

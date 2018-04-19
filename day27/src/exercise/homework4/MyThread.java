package exercise.homework4;

public class MyThread implements Runnable {
	private static int count = 100;  //总员工数
    private static int back=0;  //后门人数
    private static int front=0;//前门人数
    private Object obj = new Object();
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MyThread.count = count;
	}

	public static int getBack() {
		return back;
	}

	public static void setBack(int back) {
		MyThread.back = back;
	}

	public static int getFront() {
		return front;
	}

	public static void setFront(int front) {
		MyThread.front = front;
	}

	public void run() {
		while(count > 1) {
			synchronized(obj) {
					if("前门".equals(Thread.currentThread().getName())) {
					front++;
				}else if("后门".equals(Thread.currentThread().getName())) {
					back++;
				}
				
				System.out.println("第"+count--+"位员工，从"+Thread.currentThread().getName()
						+"入场，取出的双色球号码为:"+Shuangse.getResult());
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		}
	}
}

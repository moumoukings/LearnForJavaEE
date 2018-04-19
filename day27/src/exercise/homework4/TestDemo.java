package exercise.homework4;

public class TestDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		Thread t0 = new Thread(mt,"前门");
		Thread t1 = new Thread(mt,"后门");
		
		t0.start();t1.start();
		// 测试线程是否处于活动状态,休眠500毫秒
		if (t0.isAlive()||t1.isAlive()) {  
            try {  
                Thread.sleep(500);  
            } catch (InterruptedException e) {  
                  
                e.printStackTrace();  
            }  
        }  
		
		//输出最后结果
		System.out.println("前门总计:"+MyThread.getFront()+
				"人\t后门总计:"+MyThread.getBack()+"人\t总计："+(100-MyThread.getCount())+"人");  
	}
}

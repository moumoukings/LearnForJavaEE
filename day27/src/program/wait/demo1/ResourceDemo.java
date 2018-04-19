package program.wait.demo1;

public class ResourceDemo {
	public static void main(String[] args) {
		//创建资源对象
		Resource r = new Resource();
		//创建任务对象
		Input in = new Input(r);
		Output out = new Output(r);
		
		//创建线程对象
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		//启动线程
		t1.start();
		t2.start();
	}
}

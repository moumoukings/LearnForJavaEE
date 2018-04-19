package program.wait.demo1;
/*
 * 输入线程
 */
public class Input implements Runnable{
	private Resource r ;
	
	public Input(Resource r) {
		super();
		this.r = r;
	}

	public void run() {
		int count = 0;
		while(true) {
			if(count%2 == 0) {
				r.set("张三", "男");
			}else {
				r.set("lisi", "nv");
			}
			count++;
		}
	}
}

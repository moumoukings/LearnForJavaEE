package program.wait.demo1;

//模拟资源类

public class Resource {
	private String name;
	private String sex;
	private boolean flag = false;
	
	public synchronized void set(String name ,String sex) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 设置成员变量
		this.name = name;
		this.sex = sex;
		// 设置之后，Resource中有值，将标记该为 true 
		flag = true;
		//唤醒Output,进行数据输出
		this.notify();
	}
	
	public synchronized void out() {
		if (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		// 输出线程将数据输出
		System.out.println("姓名: " + name + "，性别: " + sex);
		// 改变标记，以便输入线程输入数据
		flag = false;
		// 唤醒input，进行数据输入
		this.notify();
	}

}

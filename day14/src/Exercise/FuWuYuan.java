package Exercise;

public class FuWuYuan extends Yuangong implements VIP {
	//重写构造方法
	public FuWuYuan() {
		super();
	}
	
	public FuWuYuan(String ID,String name) {
		super(ID,name);
	}
	
	//重写父类工作方法
	public void work() {
		System.out.println("亲，全身心为您服务，记得给好评哦!");
	}
	
	//重写接口服务方法
	public void server() {
		System.out.println("给顾客倒酒!");
	}
}

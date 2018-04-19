package program;

public class ChuShi extends Yuangong implements VIP {
	//重写构造方法
	public ChuShi() {
		super();
	}
		
	public ChuShi(String ID,String name) {
		super(ID,name);
	}
	
	@Override
	//重写父类工作方法
	public void work() {
		System.out.println("我做饭，放心吃吧，包您满意!");
	}
	
	@Override
	//重写接口服务方法
	public void server() {
		System.out.println("做菜加量加料!");
	}

}

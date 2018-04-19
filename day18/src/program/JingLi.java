package program;

public class JingLi extends Yuangong {
	//重写构造方法
	public JingLi() {
		super();
	}
				
	private double jiangJin;
	
	public double getJiangJin() {
		return jiangJin;
	}
	public void setJiangJin(double jiangJin) {
		this.jiangJin = jiangJin;
	}
	//经理特有属性：奖金
	public JingLi(String ID,String name,double jiangJin) {
		super(ID,name);
		this.jiangJin = jiangJin;
	}
	@Override
	//重写父类工作方法
	public void work() {
		System.out.println("哪个员工让顾客不满意，我扣谁钱!");
	}
	
}

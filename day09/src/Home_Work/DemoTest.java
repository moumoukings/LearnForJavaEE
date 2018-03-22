package Home_Work;

public class DemoTest {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		//调用求和成员方法
		//添加值
		d.setA(11);
		d.setB(12);
		d.sum1(d.getA(), d.getB());
		
		//调用比较类成员方法
		d.setA(99);
		d.setB(99);
		d.pan1(d.getA(), d.getB());
		
		//调用9*9类成员方法
		d.Jiu();
	}
}

package Exercise;
/*
 * 编写测试类:
	向酒店中，增加多名员工（其中包含1名经理，1名厨师、2名服务员）；
	调用酒店员工的工作功能
	调用酒店员工的VIP服务功能
 */
public class Test {
	public static void main(String[] args) {
		JingLi y1 = new JingLi("王二狗子","001",1000);
		y1.work();
		System.out.println("=========");
		
		FuWuYuan y2 = new FuWuYuan("张三","010");
		y2.work();
		y2.server();
		
		FuWuYuan y3 = new FuWuYuan("张三丰","011");
		y3.work();
		y3.server();
		System.out.println("=========");
		
		ChuShi y4 = new ChuShi("李四","031");
		y4.work();
		y4.server();
	}
}

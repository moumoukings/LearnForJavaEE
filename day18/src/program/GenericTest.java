package program;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 将酒店员工，厨师，服务员，经理，放入三个集合中
 * 定义方法，可以同时比那里三个集合的同时，调用工作方法
 */
public class GenericTest {
	public static void main(String[] args) {
		//创建三个集合
		ArrayList<ChuShi> cs = new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fwy = new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jl = new ArrayList<JingLi>();
		
		//想没每个集合存储数据
		cs.add(new ChuShi("031", "一号厨师"));
		cs.add(new ChuShi("032", "二号厨师"));
		
		fwy.add(new FuWuYuan("021","一号服务员"));
		fwy.add(new FuWuYuan("022","二号服务员"));
		
		jl.add(new JingLi("010","经理",8888));	
	}
	
	//定义方法，可以同时比那里三个集合的同时，调用工作方法
	public static void iterator(ArrayList<? extends Yuangong> array) {
		//迭代器
		Iterator<? extends Yuangong> it = array.iterator();
		while(it.hasNext()) {
			Yuangong y = it.next();
			System.out.println(y);
		}
	}
}

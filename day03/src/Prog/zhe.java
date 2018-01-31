package Prog;

public class zhe {

	public static void main(String[] args) {
//		1.珠穆朗玛峰	8848米
//		2.厚度是0.01米		折多少次
		double h = 0.01;
		int count = 0;	//累计折叠次数
		while(true) {
			if(h < 8848.0) {
				count++;
				h = h * 2.0;
//				System.out.println("第"+count+"次折，纸张是"+h+"M");
			}else {
				break;
			}
		}
		System.out.println("至少需要折"+count+"次");
	}
}

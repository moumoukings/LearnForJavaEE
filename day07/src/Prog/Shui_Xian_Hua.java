package Prog;

/* 1.要求：计算出水仙花数（100-999）
 * 		什么是水仙花数：三位数
 * 		这个数本身=个位数的立方+十位数的立方+百位数的立方
 *		153 = 1*1*1 + 5*5*5 + 3*3*3
 *
 * 2.实现步骤：
 * 	a.定义变量，存储三位的整数
 * 	b.利用循环，遍历出100-999
 * 	c.将遍历出的数，拆分开
 *  d.分别求立方相加，与原始数据比较，判断是否是水仙花数
 */

public class Shui_Xian_Hua {

	public static void main(String[] args) {
		//定义三个变量
		int bai = 0 ;
		int shi = 0 ;
		int ge = 0 ;
		
		//循环100-999
		for (int i = 100; i <= 999; i++) {
			//对i进行拆分
			//百位
			bai = i /100;
			//十位
			shi = i /10 %10;
			//个位
			ge = i %10;
			//对三个数分别求立方相加，与原始数据比较，判断是否是水仙花数
			if(bai*bai*bai + shi*shi*shi + ge*ge*ge == i) {
				System.out.println("这个数"+i+"是水仙花数");
			}
		}
	}

}

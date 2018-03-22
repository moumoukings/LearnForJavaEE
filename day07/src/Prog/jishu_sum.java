package Prog;

/*	1.计算1-100的所有奇数和; 
	  1+3+5+7+....+99;
	2.利用for循环
*/	

public class jishu_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义变量sum，表示所求的和
		int sum = 0;
		//for循环，进行0-100的循环
		for(int i = 0;i<=100;i++) {
			//对i进行奇偶判断
			if(i%2 == 1) {
				//对奇数进行求和
				sum += i;
			}
		}
		System.out.println("0-100的奇数和为："+sum);
	}

}

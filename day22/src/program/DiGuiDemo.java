package program;
/*
 * 计算1+2+3+...+n
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		System.out.println(add(100));
		System.out.println(jiecheng(3));
		System.out.println(tu(12));
	}
	//递归算连加
	public static int add(int n) {
		if(n > 1) {
			int sum = n + add(n-1);
			return sum;
		}else {			
			return 1;
		}
	}
	//递归算阶乘
	public static int jiecheng(int n) {
		if(n > 1) {
			int sum = n * jiecheng(n-1);
			return sum;
		}else {			
			return 1;
		}
	}
	//斐波那契数列
	// 1+1+2+3+5+...
	public static int tu(int n) {
		if(n <= 2) {
			return 1;
		}else {
			return tu(n-1)+tu(n-2);
		}
	}
}

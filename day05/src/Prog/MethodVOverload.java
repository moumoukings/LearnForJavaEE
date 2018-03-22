package Prog;

public class MethodVOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = getsum(1,2,3);
		System.out.println(sum);
	}

	/*
	 定义方法，对参数求和
	 */
	public static int getsum(int a,int b) {
		System.out.println("两个int参数");
		return a+b;
	}
	
	public static int getsum(int a,int b,int c) {
		System.out.println("三个int参数");
		return a+b+c;
	}
	
	public static double getsum(double a,double b) {
		System.out.println("两个double参数");
		return a+b;
	}
}

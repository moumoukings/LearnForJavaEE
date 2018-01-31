package Prog;

import java.util.Scanner;

public class Prog1{
	public static void main(String[] args){
		System.out.print("请输入你要查看的是第几个月的兔子数：");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("第"+n+"个月兔子总数为"+fun(n));
	}
	private static int fun(int n){
		if(n==1 || n==2)
		   return 1;
		else
		   return fun(n-1)+fun(n-2);
	}
}


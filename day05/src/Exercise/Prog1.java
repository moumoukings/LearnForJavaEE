package Exercise;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
	
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(add(sc.nextDouble(),sc.nextDouble()));

		//System.out.println(equals(sc.nextDouble(),sc.nextDouble()));
		
		printNn(9);
	}
	
	//(1)键盘录入两个数据,求两个数据之和(整数和小数)
	public static long add(long a, long b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}
	//(2)键盘录入两个数据,判断两个数据是否相等(整数和小数)
	public static boolean equals(long a, long b) {
		return a == b;
	}

	public static boolean equals(double a, double b) {
		return a == b;
	}
	
	//(3)打印nn乘法表 
	
	public static void printNn(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + "*" + a + "=" + a * b + "\t");
			}
			System.out.println();
		}
	}
}

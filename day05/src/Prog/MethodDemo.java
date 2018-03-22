package Prog;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printRect();
		//System.out.println(getname());
		//printRect2(3,5);
		System.out.println(getAvg(3, 4, 5));
	}

	/*
	 定义一个无返回值的方法，比如打印三行“*”，每行三个。 
	*/
	
	public static void printRect() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 定义一个方法，返回一个整数，并打印出来。
	 */
	
	public static int getname() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int name = sc.nextInt();
		return name;
	}
	
	/*
	 定义一个方法，无返回值有参数方法，如打印指定M行，每行N个*号的矩形
	 */
	
	public static void printRect2(int m,int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 定义一个有返回值有参数的的方法，如求三个数的平均数
	 */
	
	public static int getAvg(int a,int b,int c) {
		int p = (a+b+c)/3;
		return p;
	}
}

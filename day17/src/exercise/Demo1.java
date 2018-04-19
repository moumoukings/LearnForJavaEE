package exercise;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 斐波那契数
 * 	1 1 2 3 5 8...
 */
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("请输入月份:");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();

			//普通方法计算小于long的数
			/*int number = function(y);
			System.out.println(y+"月时有"+number+"只兔。");*/
		
			//BigInteger计算方法，可以超过long
			BigInteger number1 = function_1(y);
			System.out.println(y+"月时有"+number1+"只兔。");

		sc.close();
	}
	//斐波那契计算方法(计算某月时有多少兔子)
	public static int function(int y) {
			if(y <= 2) {
				return 1;
			}else {
				return function(y-1)+function(y-2);
			}
	}
	
	//BigInteger计算方法
	public static BigInteger function_1(int y) {
		
		if (y > 1) {
			BigInteger a, b = BigInteger.ONE;
			y--;  
			a = BigInteger.valueOf(y);  
			y /= 2; 
			while (y-- > 0) {
				a = a.add(b); 
				b = b.add(a); 
			}
			return b; 
		}
		return (y == 0) ? BigInteger.ZERO : BigInteger.ONE;  
	}
}

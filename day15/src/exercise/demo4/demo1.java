package exercise.demo4;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
//		从键盘循环录入录入一个字符串,输入"end"表示结束
		Scanner sc = new Scanner(System.in);
		while(true) {			
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}
		}
		sc.close();   
	}
}

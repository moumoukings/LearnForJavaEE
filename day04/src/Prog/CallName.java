package Prog;

import java.util.Random;

/*
 	随机点名器：
 	 1.存储名字；
 	 2.预览所有人的名字；
 	 3.随机出一个人名；
 */
public class CallName {
	public static void main(String[] args) {
		//存储姓名，将姓名存储到数组中
		//数组存储姓名，姓名的数据类型为string
		String[] names = {"张三","李四","小马","老王","小那","光辉"};
		
		//遍历预览所有姓名
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.println("=======================");
		
		//随机出一个人名
		//利用随机数
		Random ran = new Random();
		
		int index =ran.nextInt(names.length);
		
		System.out.println(names[index]);
	}
}

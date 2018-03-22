package Prog;

import java.util.Random;

/*
 	随机点名器：
 	 1.存储所有学生名字；
 	 2.预览所有人的名字，遍历数组；
 	 3.随机出一个人名（随机数做索引，到数组中找元素）；
 	 
 	 将功能独立出来，做成方法，便于后期维护
 */
public class CallName {
	public static void main(String[] args) {
		//定义数组，存储学生姓名 
		String[] names = new String[6];
		//调用添加姓名方法
		addStudent(names);
		//调用遍历数组方法
		printStudentName(names);
		//调用随机姓名方法
		String name = randomStudentName(names);
		System.out.println(name);
	}
	
	/*
	 定义方法，随机数做索引，数组中找出学生姓名
	 返回值无，参数为数组
	 */
	
	public static String randomStudentName(String[] names) {
		System.out.println();
		System.out.println("==========");
		Random ran = new Random();
		int index = ran.nextInt(names.length);
		return names[index];
	}
	
	/*
	 定义方法，遍历数组
	 返回值无，参数为数组
	 */
	
	public static void printStudentName(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}
	}
	
	/*
	 定义方法，实现向数组中添加学生姓名
	 返回值无，参数为数组
	 */
	
	public static void addStudent(String[] names) {
		names[0]="张三";
		names[1]="李四";
		names[2]="小马";
		names[3]="老王";
		names[4]="小那";
		names[5]="光辉";
	}
	
}

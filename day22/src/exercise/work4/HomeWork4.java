package exercise.work4;

import java.io.File;
import java.util.Scanner;

/*
 * 从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
 * 	
 */
public class HomeWork4 {
	public static void main(String[] args) {
		while(true) {
			System.out.println("请输入一个有效路径:");
			Scanner	sc = new Scanner(System.in);
			File file = new File(sc.nextLine());
			sc.close();
			System.out.println(file.getName());
			if(file.isDirectory()) {
				//调用文件夹遍历方法
				lists(file,0);
				break;
			}else {
				System.out.println("您输入的文件夹路径错误:");
				break;
			}
		}
	}
	//文件夹遍历方法
	public static void lists(File file,int level) {
		//定义初始空格数
		String pass = "";
		for (int i = 0; i < level; i++) {
			pass +="   ";
		}
		File[] fileArr = file.listFiles();
		for (File f : fileArr) {
			if(f.isDirectory()) {
				//递归调用
				System.out.println(f.getName());
				lists(f,level+1);
			}else {
				System.out.println(pass+f.getName());
			}
		}
	}
}

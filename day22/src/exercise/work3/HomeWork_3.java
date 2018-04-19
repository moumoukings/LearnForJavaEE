package exercise.work3;

import java.io.File;
import java.util.Scanner;

/*
 * 从键盘接收一个文件夹路径,删除该文件夹。
 * D:\测试文件夹2
 */
public class HomeWork_3 {
	public static void main(String[] args) {
		while(true) {  
            Scanner sc = new Scanner(System.in);  
            System.out.println("请输入文件路径");  
            String s = sc.nextLine();  
            File file = new File(s);  
            sc.close();
            if(file.isDirectory()){  
                boolean b = delete_1(file);  
                System.out.println("该文件夹是否删除成功:"+b);  
                break;  
            }else {  
                System.out.println("输入的文件夹路径错误");  
                break;
            }  
        }  
	}

	public static boolean delete_1(File file) {
		File[] fileArr = file.listFiles();
		//遍历文件夹
		for (File f : fileArr) {
			//删除文件
			if (f.isFile()) {
				f.delete();
			} else {//文件夹调用递归方法
				delete_1(f);
			}
			//删除文件夹
			f.delete();
		}
		return true;
	}
}

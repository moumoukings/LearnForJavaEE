package exercise.work2;

import java.io.File;
import java.util.Scanner;

/*
 * 从键盘接收一个文件夹路径,统计该文件夹大小。
 * D:\\Java基础班\\day22\\day22作业&预习
 */
public class HomeWork_2 {
	public static void main(String[] args) {
		while(true) {  
            Scanner sc = new Scanner(System.in);  
            System.out.println("请输入文件路径");  
            String s = sc.nextLine();  
            File file = new File(s);  
            sc.close();
            if(file.isDirectory()){  
                long size = getFilesSize(file);  
                System.out.println("该文件夹大小为:" + size);  
                break;  
            }else {  
            	System.out.println("输入的文件夹路径错误");  
                break; 
            }  
        }  
	}

	public static long getFilesSize(File file) {
		File[] fileArr = file.listFiles();
		long size = 0;
		for (File f : fileArr) {
			if(f.isFile()) {
				//如果是文件就加上该文件的大小 
				size = size + f.length();
			}else {
				//如果是文件夹，用递归思想，获取文件夹中所有文件的size
				size =size + getFilesSize(f);
			}
		}
		return size;
	}
}

package program;

import java.io.File;

/*
 * 遍历文件，取出所有.java文件
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File file = new File("D:\\测试文件夹");
		funtion(file);
	}
	public static void funtion(File file) {
		File[] fileArr = file.listFiles(new MyJavaFilter());
		for (File f : fileArr) {
			if(f.isDirectory()) {
				funtion(f);
			}else {
				System.out.println(f);
			}
		}
	}
}

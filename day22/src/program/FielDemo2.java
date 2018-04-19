package program;

import java.io.File;
public class FielDemo2 {
	public static void main(String[] args) {
		File dir = new File("D:\\abc");
		funtion_1(dir);
	}
	//遍历目录
	public static void funtion_1(File dir) {
		System.out.println(dir);
		//调用listFile()对目录，dir进行遍历
		File[] fileArr = dir.listFiles();
		for (File f : fileArr) {
			//判断f是否是文件夹
			if(f.isDirectory()) {
				funtion_1(f);
			}else {
				System.out.println(f);
			}
		}
	}
}

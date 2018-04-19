package exercise.work1;

import java.io.File;
/*
 * 滤器筛选将指定文件夹下的小于200K的小文件
 */
public class HomeWork_1 {
	public static void main(String[] args) {
		File file = new File("D:\\测试文件夹");
		File[] fileArr = file.listFiles(new MyFilter_1());
		for (File f : fileArr) {
			System.out.println(f);
		}
	}
}

package exercise.work1;

import java.io.File;
import java.io.FileFilter;
/*
 * 滤器筛选将指定文件夹下的小于200K的小文件
 */
public class MyFilter_1 implements FileFilter {
	public boolean accept(File pathname) {
		if(pathname.isFile() && (pathname.length() <= (200*1024))) {
			return true;
		}
		return false;
	}
}

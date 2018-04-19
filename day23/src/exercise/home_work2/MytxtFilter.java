package exercise.home_work2;

import java.io.File;
import java.io.FileFilter;

public class MytxtFilter implements FileFilter {
	public boolean accept(File pathname) {
		String name = pathname.getName();//获取文件名
		if(pathname.isDirectory()) {
			//当获取的是目录时，直接返回true
			return true;
		}else {			
			//获取文件的尾部，先将获取文件全换为小写，在与".txt"比较
			return name.toLowerCase().endsWith(".txt");
		}
		
		//return pathnamr.getName.endsWith(".java");
	}
}

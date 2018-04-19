package program;

import java.io.File;
import java.io.FileFilter;

public class MyJavaFilter implements FileFilter {
	public boolean accept(File pathname) {
		String name = pathname.getName();//获取文件名
		if(pathname.isDirectory()) {
			//当获取的是目录时，直接返回true
			return true;
		}else {			
			//获取文件的尾部，先将获取文件全换为小写，在与".java"比较
			return name.toLowerCase().endsWith(".java");
		}
		
		//return pathnamr.getName.endsWith(".java");
	}
}

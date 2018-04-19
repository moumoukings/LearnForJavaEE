package program;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
	public boolean accept(File pathname) {
		String name = pathname.getName();//获取文件名
		return name.endsWith(".java");//获取文件的尾部
		
		//return pathnamr.getName.endsWith(".java");
	}
}

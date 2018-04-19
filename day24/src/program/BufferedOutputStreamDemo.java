package program;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 写数据到文件的方法
 * 1,创建流
 * 2，写数据
 * 3，关闭流
 */

public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\测试文件夹2\\b.txt");
		//使用高效流
		BufferedOutputStream out = new BufferedOutputStream(fos);
		
		out.write("怎么看".getBytes());
		out.flush();
		out.close();
	}
}

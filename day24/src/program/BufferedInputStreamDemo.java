package program;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\测试文件夹2\\b.txt");
		
		//创建高效输入流(一般不会用于读文本文件)
		BufferedInputStream bis = new BufferedInputStream(fis);
		int len = 0;
		while((len = bis.read()) != -1) {
			System.out.print((char)len);
		}
		bis.close();
	}
}

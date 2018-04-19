package program;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\测试文件夹2\\a.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		int len = 0; 	
		while((len = isr.read()) != -1) {
			System.out.print((char)len);
		}
		isr.close();
	}
}

package program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建与文件关联的字节输出流对象
		FileOutputStream fos = new FileOutputStream("D:\\测试文件夹2\\a.txt");
		//创建可以把字符转成字节的转换流对象，并指定编码
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		//将文字写到缓存区去
		osw.write("怎么填");
		osw.close();
	}
}

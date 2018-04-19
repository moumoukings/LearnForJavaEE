package exercise.homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * java写一个程序，实现从文件中读出文件内容
 * 		并将其打印在屏幕当中，并标注上行号
 */
public class Reader_java {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("D:\\测试文件夹\\Copy_1.java");
		BufferedReader bis = new BufferedReader(fis);
		int LineNumber = 0;
		String len = null;
		while((len = bis.readLine()) != null) {
			LineNumber++;
			System.out.println(LineNumber+" "+len);
		}
		bis.close();
	}
}

package program;

import java.io.FileReader;
import java.io.FileWriter;
/*
 * 字符流复制文本文件，必须是文本文件
 */
public class Copy_2 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("D:\\测试文件夹\\a.txt");
			fw = new FileWriter("D:\\测试文件夹2\\a.txt");
			char[] cbuf = new char[1024];
			int len = 0;
			while((len = fr.read(cbuf)) != -1) {
				fw.write(cbuf, 0, len);
				fw.flush();
			}
		} catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException("文件复制失败");
		}finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			} catch (Exception e) {
				System.out.println(e);
				throw new RuntimeException("关闭资源失败");
			}finally {
				try {
					if(fr!=null) {
						fr.close();
					}
				} catch (Exception e) {
					System.out.println(e);
					throw new RuntimeException("关闭资源失败");
					}
			}
		}
	}
}

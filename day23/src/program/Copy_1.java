package program;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 字节流复制文件
 *   采用数组缓冲提高效率
 *   字节数组
 *   FileInputStream 读取字节数组
 *   FileOutputStream 写字节数组
 */
public class Copy_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\测试文件夹\\a.txt");
			fos = new FileOutputStream("D:\\测试文件夹2\\a.txt");
			byte[] b = new byte[1024];
			int len = 0;
			while((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException("文件复制失败");
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			} catch (Exception e) {
				System.out.println(e);
				throw new RuntimeException("关闭资源失败");
			}finally {
				try {
					if(fis!=null) {
						fis.close();
					}
				} catch (Exception e) {
					System.out.println(e);
					throw new RuntimeException("关闭资源失败");
					}
			}
		}
	}
}

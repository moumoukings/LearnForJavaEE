package program;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  文件复制方式,字节流,一共4个方式
 *  1. 字节流读写单个字节                    217719 毫秒
 *  2. 字节流读写字节数组                    344    毫秒  OK
 *  3. 字节流缓冲区流读写单个字节     1187   毫秒
 *  4. 字节流缓冲区流读写字节数组     125    毫秒  OK
 */
public class Copy {
	public static void main(String[] args) throws IOException {
		long s = System.currentTimeMillis();
		copy_4(new File("D:\\测试文件夹\\a.cab"), new File("D:\\测试文件夹2\\a.cab"));
		long e = System.currentTimeMillis();
		System.out.println("复制文件用了"+(e-s)+"毫秒。");
	}
	//4. 字节流缓冲区流读写字节数组
	public static void copy_4(File src,File desc) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0 ;
		byte[] bytes = new byte[1024];
		while((len = bis.read(bytes))!=-1){
			bos.write(bytes,0,len);
		}
		bos.close();
		bis.close();
	}
	//3. 字节流缓冲区流读写单个字节
	public static void copy_3(File src,File desc) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
		int len = 0 ;
		while((len = bis.read())!=-1){
			bos.write(len);
		}
		bos.close();
		bis.close();	
	}
	//2. 字节流读写字节数组
	public static void copy_2(File src,File desc) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
			fos.flush();
		}
		fos.close();
		fis.close();
	}
	
	//1. 字节流读写单个字节
	public static void copy_1(File src,File desc) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(desc);
		
		int len = 0;
		while((len = fis.read()) != -1) {
			fos.write(len);
			fos.flush();
		}
		fos.close();
		fis.close();
	}
}

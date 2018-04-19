package exercise.home_work1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*要求：
 * 	1.从键盘接收两个文件夹路径
 * 	2.把其中一个文件夹的子文件（包含内容）拷贝到另一个文件夹
 * 	
 * 方法：
 * 	1.运用Scanner方法输入两个相关路径
 * 	2.同时运用文件的输入流读出mu文件夹的所有内容和文件输出流往zi文件夹中写入所有读到的内容
 * 	3.过程中利用字节数组byte[] 提高复制速率
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要复制的母文件夹路径：");
		String mu = sc.nextLine();
		File file_mu = new File(mu);
		
		System.out.println("请输入复制到的子文件夹路径：");
		String zi = sc.nextLine();		
		File file_zi = new File(zi);
		sc.close();
		
		//调用复制方法
		copyFile(file_mu, file_zi);
	}
	public static void copyFile(File file_mu,File file_zi) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//遍历母文件夹的所有文件
		File[] fileArr  = file_mu.listFiles();
		for (File f : fileArr) {
			if(f.isDirectory()) {
				//如果是文件夹，需要将文件夹名以及文件夹中的文件全部复制到zi文件夹中
				//创建新的文件绝对路径与zi文件夹相同，名字从读取的文件中获取
				//其中"\\"用于路径分隔
				File file = new File(file_zi.getAbsolutePath()+"\\"+f.getName());
				//创建目录（文件夹）
				file.mkdirs();
				copyFile(f, file);
			}else {
				fis = new FileInputStream(f);
				fos = new FileOutputStream(file_zi.getAbsolutePath()+"\\"+f.getName());
				
				//建立字节数组
				byte[] buf = new byte[1024];
				int len = 0;
				while((len=fis.read(buf)) != -1) {
					fos.write(buf, 0, len);
				}
				fos.close();
				fis.close();
			}
		}
	}
}

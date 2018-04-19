package exercise.home_work2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


/*
 * 1.先找出指定路径的txt文件
 * 		
 * 2.复制到指定位置
 * 		调用copyFile方法
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要寻找的母文件夹路径：");
		String mu = sc.nextLine();
		File file_mu = new File(mu);
		
		System.out.println("请输入子文件夹路径：");
		String zi = sc.nextLine();		
		File file_zi = new File(zi);
		sc.close();
		
		//调用寻找方法
		searchFile(file_mu, file_zi);
	}

	public static void searchFile(File file_mu, File file_zi) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//遍历母文件夹的所有文件
		File[] fileArr  = file_mu.listFiles(new MytxtFilter());
		for (File f : fileArr) {
			if(f.isDirectory()) {
				//如果是文件夹，需要将文件夹名以及文件夹中的文件全部复制到zi文件夹中
				//创建新的文件绝对路径与zi文件夹相同，名字从读取的文件中获取
				//其中"\\"用于路径分隔
				File file = new File(file_zi.getAbsolutePath()+"\\"+f.getName());
				//创建目录（文件夹）
				file.mkdirs();
				searchFile(f, file);
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

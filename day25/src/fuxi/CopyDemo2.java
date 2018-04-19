package fuxi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
/*
 * 获取指定目录及子目录下所有txt文件的个数，并将这些txt文件复制到D盘下任意目录
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		//文件源
		File src = new File("D:\\测试文件夹");
		//文件目的
		File dest = new File("D:\\测试文件夹2\\1");
		int count = 0;
        count = fileNum(src, dest, count);
        System.out.println("txt文件的个数为：" + count);
    }

	private static int fileNum(File src, File dest, int count) throws IOException {
		//遍历文件
		for (File f : src.listFiles()) {
			if(f.isDirectory()) {
				count = fileNum(f, dest, count);
			}else {
				if(f.getName().endsWith(".txt")) {
					count++;
					copyFile(f,new File(dest,f.getName()));
				}
			}
		}
		return count;
	}

	private static void copyFile(File src, File dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(src));
		
		PrintWriter pw = new PrintWriter(new FileWriter(dest));
		while(br.ready()) {
			pw.println(br.readLine());
			pw.flush();
		}
		pw.close();
		br.close();
	}
}

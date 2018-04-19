package exercise.home_work3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * 获取指定目录及子目录下所有txt文件的个数，并将这些txt文件复制到D盘下任意目录
 */
public class CopyDemo {
	public static void main(String[] args) {
		//文件源
		File src = new File("D:\\测试文件夹");
		//文件目的
		File dest = new File("D:\\测试文件夹2");
		int count = 0;
        try {
            count = fileNum(src, dest, count);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        System.out.println("txt文件的个数为：" + count);
    }

	//获取文件源中txt文件个数
	public static int fileNum(File src, File dest, int count) throws IOException {
		//将文件源中文件存入数组
		//File[] fileArr = src.listFiles();
		//遍历文件源中的所有文件
		for (File f : src.listFiles()) {
			if(f.isDirectory()) {
				count = fileNum(f, dest, count);
			}else {
				//判断文件是否是.txt结尾
				if(f.getName().toLowerCase().endsWith(".txt")) {
					count++;
					//将文件源文件复制到目的路径且目的路径文件名与原先相同
					copyFile(f, new File(dest, f.getName()));
				}
			}
		}
		return count;
	}

	//复制文件
	//使用字符缓冲流 Buffered
	public static void copyFile(File src, File dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(src));
		//打印流,将缓冲区文件存入目的路径
		PrintWriter pw = new PrintWriter(new FileWriter(dest));
		String line = null;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		//释放资源
		br.close();
		pw.close();
	}
}

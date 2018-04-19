package exercise.home_work2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 文件源：D:\测试文件夹\day25\config.properties
 * 使用IO字节流对象和Properties类结合使用,将配置文件中的score键的值修改为100
 * 
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		//创建字符输入流对象
		FileReader fr = new FileReader("D:\\测试文件夹\\day25\\config.properties");
		//流对象读取键值
		pro.load(fr);
		//修改score的值
		pro.setProperty("score","100");
		
		//创建字符输出流对象
		//重新写回新的目的路径D:\测试文件夹2\config.properties
		FileWriter fw = new FileWriter("D:\\测试文件夹2\\config.properties");
		pro.store(fw, "StudentInfo");
		fw.close();
		fr.close();
	}
}

package fuxi;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 文件源：D:\测试文件夹\day25\config.properties
 * 使用IO字节流对象和Properties类结合使用,将配置文件中的score键的值修改为100
 * 
 */
public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
		//创建流对象
		Properties pro = new Properties();
		//创建字符输入流对象
		FileReader fr = new FileReader(new File("D:\\测试文件夹\\day25\\config.properties"));
		//从流对象中读取数据
		pro.load(fr);
		//修改成绩
		pro.setProperty("score", "100");
		//创建字符输出流对象
		FileWriter fw = new FileWriter(new File("D:\\测试文件夹2\\config.properties"));
		
		pro.store(fw, "Score");
		//关闭资源
		fw.close();
		fr.close();
	}
}

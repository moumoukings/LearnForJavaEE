package exercise.homework1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/*
 * 1.有如下字符串
 * 		"If you want to change your fate I 
 * 			think you must come to the dark horse to learn java"(用空格间隔)
 * 
 * 2.打印格式：
 *		to=3
 *		think=1
 *		you=2
 *		//........
 *
 * 3.按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用高效流)
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		String s = "If you want to change your fate I think you " +
				"must come to the dark horse to learn java";
		
		
		
		
		//创建目的路径
		FileOutputStream fos = new FileOutputStream("D:\\测试文件夹\\day24\\count.txt");
		
		//写入数据
		fos.write(get(s).getBytes());
		fos.flush();
		fos.close();
	}

	public static String get(String s) {
		//使用" "进行切割
		String[] str = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String ss:str){
			Integer num = map.get(ss);
			if(num==null){
			num = 1;                 
			}else {
			num++;
			}
			map.put(ss,num);
		}
		return map.toString();
	}
}

package exercise.home_work5;
/*
 * list集合添加姓名
 * 将二丫替换为王小丫
 * 写入到"D:\\stuinfo.txt"
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) throws IOException {		
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("二丫");
		list.add("钱六");
		list.add("孙七");
		//Collections.sort(list);
		
		//替换掉二丫
		list.set(3, "王小丫");
		//输出到D:\\stuinfo.txt
		for (int i = 0; i < list.size(); i++) {
			String d = list.get(i);
			putInNumber(d);
		}
		
	}

	public static void putInNumber(String d) throws IOException {
		String str = d + "";  
        FileOutputStream fos = new FileOutputStream("D:\\测试文件夹\\stuinfo.txt", true);
        fos.write(str.getBytes());  
        fos.write('-');
        fos.flush();
        
        fos.close();
	}
}

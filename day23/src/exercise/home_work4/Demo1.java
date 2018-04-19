package exercise.home_work4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 产生10个1-100的随机数，并放到一个数组中
 * 	1.把数组中大于等于10的数字放到一个list集合中，并打印到控制台
 * 	2.把数组中的数字放到当前文件夹的num.txt文件中
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		//产生10个随机数在0-100之间
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*100)); 
		}
		//打印list集合
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			int d = list.get(i);
			putInNumber(d);
		}
		
	}

	public static void putInNumber(int d) throws IOException {
		String str = d + "";  
        FileOutputStream fos = new FileOutputStream("D:\\测试文件夹\\num.txt", true);
        fos.write(str.getBytes());  
        fos.write('-');
        fos.flush();
        
        fos.close();
	}
}

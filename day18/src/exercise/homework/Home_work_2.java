package exercise.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Home_work_2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("b");
		list.add("f");
		list.add("e");
		list.add("c");
		list.add("a");
		list.add("d");
		sort(list);
		System.out.println(list);	// a, b, c, d, e, f
	}

	//要求对集合中添加的元素排序
	public static void sort(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				
				//已知单个字符排序用charAt(0)就行返回指定索引的char值
				//if(list.get(i).charAt(0) < list.get(j).charAt(0)) {
				
				//原字符串中元素内有多个字符，则调用toCharArray()返回char[]
				if(list.get(i).toCharArray()[0] < list.get(j).toCharArray()[0]) {
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		//Collections.sort(list);// 调用集合工具类的排序方法
	}
}

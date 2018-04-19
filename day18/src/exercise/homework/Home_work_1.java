package exercise.homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 定义方法统计集合中指定元素出现的次数
 * 如"a" 3,"b" 2,"c" 1
 */
public class Home_work_1 {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		System.out.println(function(list, "a"));
		System.out.println(function(list, "b"));
		System.out.println(function(list, "c"));
		System.out.println(function(list, "d"));
	}
	//定义方法统计集合中指定元素出现的次数
	public static String function(ArrayList<String> list,String str) {
		Iterator<String> it = list.iterator();
		//计数器
		int count = 0;
		while(it.hasNext()) {
			if(it.next().equals(str)) {
				count++;
			}
		}
		return (str+"  "+count);
	}
}

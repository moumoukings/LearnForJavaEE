package program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * 利用HashSet对list集合去重(最终结果:list中没有重复元素)
 */
public class Homework_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		to_heavy(list);
	}
	//定义方法：对list集合去重(利用HashSet)
	public static void to_heavy(List<String> list) {
		HashSet<String> newlist = new HashSet<String>(list);
		
		System.out.println(newlist);
	}
}

package program;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework_2 {
	public static void main(String[] args) {
		Collection<Object> h = new HashSet<Object>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		boolean b = containsDemo(h, 4);
		System.out.println(b);
	}
	//自己写出contains 方法
	//匹配原集合中是否含有该元素
	public static boolean containsDemo(Collection<Object> h,Object o) {
		Iterator<Object> it = h.iterator();
		
		while(it.hasNext()) {
			Object i = it.next();
			if(i == o) {
				return true;
			}
		}
		return false;
	}
}

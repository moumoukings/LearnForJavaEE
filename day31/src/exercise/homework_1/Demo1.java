package exercise.homework_1;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 	ArrayList<Integer> list = new ArrayList<Integer>(); 
	这个泛型为Integer的ArrayList中存放一个String类型的对象
*/
public class Demo1 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		
		Class c = Class.forName("java.util.ArrayList");
		Object obj = c.newInstance();
		Method method = c.getMethod("add", Object.class);
		method.invoke(list,"再见！");
		System.out.println(list);
	}
}

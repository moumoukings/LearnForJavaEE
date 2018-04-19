package program.Map_bianli;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 对HashMap遍历
 * 	方法一：键找值，然后调用keSet()取键，get()取值
 * 	方法二：Entry键值对遍历，利用entry中的getKey()和getValue()取出键值对
 */
	
public class Demo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();

		//添加元素
		map.put("a",11);		
		map.put("b",12);		
		map.put("c",13);	
		//调用方法一
//		function_1(map);
		//调用方法二
		function_2(map);
	}
	
	//方法一：键找值，然后调用keSet()取键，get()取值
	public static void function_1(HashMap<String, Integer> map) {
		//将HashMap里的键存入set集合中
		Set<String> keySet = map.keySet();

		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			//取键
			String key = it.next();
			//取值
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
		}
		System.out.println("======");
		//增强for遍历
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
		}
	}
	
	//方法二：Entry键值对遍历，利用entry中的getKey()和getValue()取出键值对
	public static void function_2(HashMap<String, Integer> map) {
		//获取Map中所有的key，value关系(Entry是Map的静态方法),存入set集合
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			//取得一一对应关系
			Map.Entry<String, Integer> entry = it.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"..."+value);
//			System.out.println(it.hasNext());
		}
		System.out.println("=======");
		//增强for循环
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"..."+value);
		}
	}
}

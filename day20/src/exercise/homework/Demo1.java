package exercise.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 对HashMap遍历
 * 	方法一：键找值，然后调用keSet()取键，get()取值
 * 	方法二：Entry键值对遍历，利用entry中的getKey()和getValue()取出键值对
 */
public class Demo1 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("a", "12");
		map.put("b", "13");
		map.put("c", "14");
		map.put("d", "15");
		//键找值
		//function_1(map);
		//Entry 
		function_2(map);
	}
	public static void function_2(HashMap<String, String> map) {
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"..."+value);
		}
		System.out.println("=========");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"..."+value);
		}
	}
	//键找值
	public static void function_1(HashMap<String,String> map) {
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+"..."+value);
		}
		System.out.println("==========");
		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key+"..."+value);
		}
	}
}

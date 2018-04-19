package program.Map_Zidingyi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//创建Map集合
		Map<Person, String>	map = new HashMap<Person, String>();
		//添加元素
		map.put(new Person("张三", 18), "江西");
		map.put(new Person("张四", 22), "浙江");
		map.put(new Person("张五", 13), "湖南");
		
		//遍历取出
		Set<Map.Entry<Person, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Person, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Person, String> entry = it.next();
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"..."+value);
		}
		System.out.println("=========");
		//增强for
		for (Map.Entry<Person, String> entry : entrySet) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"..."+value);
		}
	}
}

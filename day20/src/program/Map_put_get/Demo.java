package program.Map_put_get;

import java.util.HashMap;

/*
 * Map中的方法调用
 * 	put(k,v)	添加元素
 * 	get(k,v)	获取元素
 */
public class Demo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		//添加元素
		map.put("a",11);		
		map.put("b",12);		
		map.put("c",13);
		
		System.out.println(map);
		
		//获取元素: 指定键值，获取所对应的值
		Integer i = map.get("c");
		System.out.println(i);
	}
}

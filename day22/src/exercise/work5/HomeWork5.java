package exercise.work5;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
 * 	注意:		
 * 		用文件类型(后缀名,不包含.(点),如："java","txt")作为key
 *		用个数作为value,放入到map集合中,并用两种方式遍历map集合
 */
public class HomeWork5 {
	public static void main(String[] args) {
		while(true) {  
            Scanner sc = new Scanner(System.in);  
            System.out.println("请输入文件路径");  
            String s = sc.nextLine();  
            File dir = new File(s);  
            sc.close();
            if(dir.isDirectory()){  
            	Map<String, Integer> map = new HashMap<String, Integer>();
            	//调用计算类型个数的方法
        		getGeshu(dir,map); 
        		//调用map遍历方法
        		entrySetPrint(map);
        		System.out.println("=================");
        		keySet(map);
        		break;  
            }else {  
                System.out.println("输入的文件夹路径错误");  
                break;
            }  
        }  
	}
	//定义计算类型个数的方法
	public static void getGeshu(File dir,Map<String, Integer> map) {
		File[] fileArr = dir.listFiles();
		for (int i = 0;i < fileArr.length;i++) {
			if (fileArr[i].isDirectory()) {
				//递归方法
				getGeshu(fileArr[i], map);
			} else {
				//获取文件名字符串
				String str = fileArr[i].getPath();
				//String str = fileArr[i].toString();
				//截取文件后缀“.”之后的字符串
				str = str.substring(str.lastIndexOf(".")+1);
				//map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
				//该映射如果包含指定key的映射，则返回true
				if (map.containsKey(str)) {
					//类型个数+1
					Integer n = map.get(str)+1;
					map.put(str, n);
				} else {
					//类型个数返回1
					Integer n = 1;
					map.put(str, n);
				}
			}
		}
	}
	//map遍历方法一
	public static void entrySetPrint(Map<String, Integer> map) {
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "..." + entry.getValue());  
		}
		System.out.println("************");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entrykey = it.next();			
			System.out.println(entrykey.getKey() + "..." + entrykey.getValue());  
		}
	}
	//map遍历方法二
	public static void keySet(Map<String, Integer> map) {
		for(String key:map.keySet()) {			
			System.out.println(key+ "..." + map.get(key));  
		}
		System.out.println("************");
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"..."+map.get(key));
		}
	}
}

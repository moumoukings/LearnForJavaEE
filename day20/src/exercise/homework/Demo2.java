package exercise.homework;

import java.util.HashMap;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}			
		}
		for (Character key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key+"  "+value);
		}
	}
}

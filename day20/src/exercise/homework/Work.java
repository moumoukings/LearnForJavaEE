package exercise.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * (1)利用键盘录入，输入一个字符串
 * (2)统计该字符串中各个字符的数量
 * 实现效果：
 * 	用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
 *  程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
 */
public class Work {
	public static void main(String[] args) {
		System.out.println("请输入字符串(回车结束):");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		//将字符串变为字符数组
		char[] c = str.toCharArray();
		//构建Map集合，字符为键    次数为值
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//取出char[]中的字符
		for (int i = 0; i < c.length; i++) {
			char c1 = c[i];
			if(map.containsKey(c1)) {
				//比较map中是否有重复，没有返回value == 1
				map.put(c1, map.get(c1)+1);
			}else {
				//当有重复时value进行加1操作
				map.put(c1,1);
			}
		}
		//创建缓冲池StringBuffer
		/*StringBuffer sb = new StringBuffer();
		StringBuffer rs = null;*/
		//遍历map集合
		Set<Character> s = map.keySet();
		Iterator<Character> it = s.iterator();
		while(it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
//			rs = sb.append(key).append("(").append(value).append(")");
			System.out.print(key+"("+value+")");
		}
//		System.out.println(rs);
	}
}

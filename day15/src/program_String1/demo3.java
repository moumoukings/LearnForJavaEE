package program_String1;
/*
 * 题目三：
 * 	查询大字符串中，出现指定小字符串的次数。
 * 	如“hellojava,nihaojava,javazhenbang”中查询出现“java”的次数。
 * 
 */
public class demo3 {
	public static void main(String[] args) {
		String str = "hellojava,nihaojava,javazhenbang";
		String zi = "java";
		function(str,zi);
	}
	
	public static void function(String str,String zi) {
		int count = 0;//出现子串的次数
		int index = -1;//出现子串的索引
		
		while((index = str.indexOf(zi)) != -1) {
			count++;//找到相同的子串进行+1
			str = str.substring(index+1);//进行完第一次寻找，索引+1，继续寻找
		}
		System.out.println("原字符串中有"+count+"个相同子串。");
	}
}

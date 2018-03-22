package program_String1;
/*
 * 题目二：
 * 	将字符串中，第一个字母转换成大写，
 * 	其他字母转换成小写，并打印改变后的字符串。
 * 
 */
public class demo2 {
	public static void main(String[] args) {
		String str = "sdsASFfS";
		function(str);
	}
	
	public static void function(String str) {
		//调出原字符串的第一个字符
		String str1 = str.substring(0, 1);
		
		//调出原字符串的剩下字符
		String str2 = str.substring(1);
		
		//将第一个字符换成大写
		String big = str1.toUpperCase();
		//将剩下字符换成小写
		String small = str2.toLowerCase();
		
		System.out.println("新的字符串为："+big+small);
	}
}

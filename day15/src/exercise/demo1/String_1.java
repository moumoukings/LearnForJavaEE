package exercise.demo1;
/*
 * 
 * 
 */
public class String_1 {
	public static void main(String[] args) {
		String str = " asF2A6Na3s22 ";
		function_1(str);
		function_2(str);
		function_3(str);
		function_4(str);
		function_5(str);
		function_6(str);
		function_7(str);
	}
	
	/*
	 * String trim():
	 * 去掉字符串两端空格
	 */
	public static void function_7(String str) {
		String s = str.trim();
		System.out.println(s);
	}
	
	/*
	 * String repalce(String old, String newstr):
	 * 将字符串中的老字符串,替换为新字符串
	 */
	public static void function_6(String str) {
		String s = str.replace("3s", "qwe");
		System.out.println(s);
	}
	
	/*
	 * String repalce(char oldChar, char newChar):
	 * 将字符串中的老字符,替换为新字符
	 */
	public static void function_5(String str) {
		String s = str.replace('s', 'Q');
		System.out.println(s);
	}
	/*
	 * String toUpperCase():
	 * 字符串转成大写
	 */
	public static void function_4(String str) {
		String s = str.toUpperCase();
		System.out.println(s);
	}
	
	/*
	 * String toLowerCase():
	 * 字符串转成小写
	 */
	public static void function_3(String str) {
		String s = str.toLowerCase();
		System.out.println(s);
	}
	
	/*
	 * char charAt(int index):
	 * 返回索引上的字符
	 */
	public static void function_2(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);			
			System.out.print(c+",");
		}
		System.out.println();
	}
	
	/*
	 *	boolean isEmpty(): 
	 * 		判断字符串是不是空串,如果是空的就返回true
	 */
	public static void function_1(String str) {
		boolean b = str.isEmpty();
		System.out.println(b);		
	}
}

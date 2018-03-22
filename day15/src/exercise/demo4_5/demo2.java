package exercise.demo4_5;
/*
 * 要求：
 * 	将字符串中大写字母变成小写字母
 * 	小写字母变成大写字母
 * 	其它字符用"*"代替
 * 	并统计字母的个数
 */
public class demo2 {
	public static void main(String[] args) {
		String str = "Hello12345World";
		String s = function(str);
		System.out.println(s);
	}
	
	public static String function(String str) {
		//将字符串存入char型数组
		char[] c = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		//遍历数组c
		for (int i = 0; i < c.length; i++) {
			if(c[i]>='A' && c[i]<='Z') {
				buffer.append((c[i]+"").toLowerCase());
			}else if(c[i]>='a' && c[i]<='z') {
				buffer.append((c[i]+"").toUpperCase());
			}else {
				buffer.append("*");
			}
		}
		return buffer.toString();
	}
}

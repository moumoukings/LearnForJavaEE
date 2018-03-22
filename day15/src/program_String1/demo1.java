package program_String1;
/*
 *题目一：
 *	获取指定字符串中
 *	大写字母、小写字母、数字的个数。
 *
 */
public class demo1 {
	public static void main(String[] args) {
		String str = "AdcDFa185A3Vcdf";
		function(str);
	}
	
	public static void function(String str) {
		int bigCount = 0;
		int smallCount = 0;
		int number = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >='A' && ch <='Z') {
				bigCount++;
			}else if (ch >='a' && ch<='z') {
				smallCount++;
			} else if(ch >='0' && ch <= '9') {
				number++;
			}
		}
		System.out.println("大写字母个数："+bigCount);
		System.out.println("小写字母个数："+smallCount);
		System.out.println("数字个数："+number);
		System.out.println("该字符串的长度："+str.length());
	}
}

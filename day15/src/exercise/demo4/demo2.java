package exercise.demo4;
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
		//将字符串存到char型数组中
		char[] cArray = str.toCharArray();
		//创建一个缓冲池
        StringBuffer sb = new StringBuffer();
        //遍历char数组
        for(int i=0; i<cArray.length; i++) {
        	//判断数组元素（小写转换成大写，大写转换成小写，其他改成*号）
            if(cArray[i] >= 'a' && cArray[i] <='z'){
                sb.append((cArray[i]+"").toUpperCase());
            }else if(cArray[i] >= 'A' && cArray[i] <='Z'){
                sb.append((cArray[i]+"").toLowerCase());
            }else {
                sb.append("*");
            }            
        }
        return sb.toString();
        }
}
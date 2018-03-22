package exercise.demo4_5;

/* 要求：
 	定义一个方法
	public Object[] deleteSubString(String str1,String str2) {}
*/

public class demo3 {
	public static void main(String[] args) {
		Object[] obj = new demo3().deleteSubString("aab1c3dd4efg","1c");
		System.out.println(obj[0]);
		System.out.println(obj[1]);
	}
	
	/* 
	 * 该数组的第一个元素为删除所有的str2后的最终的字符串
	 * 该数组的第二个元素为删除的str2的个数
	 * 记录相同str2的个数及删除的个数
	 */	
	public Object[] deleteSubString(String str1,String str2) {
		int count = 0;
		while(str1.indexOf(str2) > -1) {
			str1 = str1.replace(str2, "");
			count++;
		}
//		创建数组
		Object[] obj = {str1,count};
		return	obj;
	}
}

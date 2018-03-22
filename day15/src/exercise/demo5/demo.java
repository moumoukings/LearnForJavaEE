package exercise.demo5;

/* 要求：
 	 定义一个方法
	public Object[] deleteSubString(String str1,String str2) {}
*/

public class demo {
	public static void main(String[] args) {                           
		Object[] obj=new demo().deleteSubString("aab1c3dd4efg","1c");
		System.out.println(obj[0]);
		System.out.println(obj[1]);
	}
	
	/* 
	 * 该数组的第一个元素为删除所有的str2后的最终的字符串
	 * 该数组的第二个元素为删除的str2的个数
	 */		
	public Object[] deleteSubString(String str1,String str2) {
		int count = 0;
		while(str1.indexOf(str2) > -1) {
			str1 = str1.replaceFirst(str2, "");
			count++;
		}
		Object[] obj = new Object[2];
		obj[0] = str1;
		obj[1] = count;
		return obj;
	}
}

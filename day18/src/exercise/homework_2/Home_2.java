package exercise.homework_2;
/*
 * 利用正则表达式过滤出符合条件的手机号码
 * 	规则：第1位是1，第二位可以是数字358其中之一，
 * 		后面6位任意数字，最后3位为任意相同的数字。
 */
public class Home_2 {
	public static void main(String[] args) {
		 String [] str = {"16210626656","18601066888","139123876rrr","13156166693","15115888028"};
		 //遍历字符串数组
		 for (int i = 0; i < str.length; i++) {
			 String s = str[i];
			//设置正则表达式   \1表示取第一个()内匹配的数据
			 if(s.matches("[1][358][0-9]{6}([0-9])\\1{2}")) {
				 System.out.println(s);
			 }
		}
	}
}

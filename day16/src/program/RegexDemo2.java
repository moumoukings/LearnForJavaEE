package program;
/*
 * 检查邮箱地址是否合法
 * 	规则：
 * 	####@###.com###
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		checkMail();
	}
	public static void checkMail() {
		String str = "zahngsan@yahoo.com.cn";
		boolean b = str.matches("[a-zA-Z_0-9]+@[a-z0-9]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}

package program;

public class RegexDemo {
	public static void main(String[] args) {
		split_1();
	}
	
	public static void split_1() {
		String ip = "192.168.110.3";
		String[] strArr =ip.split("\\.");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}

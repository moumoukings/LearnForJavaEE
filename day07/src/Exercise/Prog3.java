package Exercise;

public class Prog3 {
	/*
	  要求：
	  	(1) 计算15+25+35+....+1005的和
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 15;i <= 1005;i += 10) {
			sum += i;
		}
		System.out.print("15+25+35+45+55+...+1005="+sum);
	}
}

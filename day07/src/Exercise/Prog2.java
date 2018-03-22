package Exercise;

public class Prog2 {
	/*
	  要求：
	  	(1)倒着打印九九乘法表
	 */
	public static void main(String[] args) {
		for(int i = 9;i>=1;i--) {
			for(int j = 9;j>=i;j--) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}

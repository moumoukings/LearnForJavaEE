package Exercise;

public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			int num = f(i);
		System.out.print(num+",");
		}
		
	}
	public static int f(int n) {
		if(n <= 2) {
			return 1;
		}else {
			int i = f(n-1)+f(n-2);
			return i;
		}	
	}
}

package Prog;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		if(x >= 3) {
			y = 2 * x + 1;
		}else if(x>-1 && x<3) {
			y = 2 * x;
		}else {
			y = 2 * x - 1;
		}
		System.out.println("y="+y);
	}

}

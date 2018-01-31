package Prog;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int m = Math.max(x, y);
		int max = Math.max(m, z);
		System.out.println("Max="+max);
	}
}

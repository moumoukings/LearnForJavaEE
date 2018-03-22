package Prog;

public class Test {
	public static void main(String[] args) {
		Bi_jiben b = new Bi_jiben();
		b.openComputer();
		
		Mouse m = new Mouse();
		b.useUSB(m);
		System.out.println("=========");
		
		Jian_Pan j = new Jian_Pan();
		b.useUSB(j);
		
		b.closeComputer();
	}
}

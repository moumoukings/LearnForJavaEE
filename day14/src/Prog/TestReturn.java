package Prog;

public class TestReturn {
	public static void main(String[] args) {
		GetSmoking g = new GetSmoking();
		
		Smoking s = g.getSmoking();
		s.smoking();
		
		//匿名调用
		new GetSmoking().getSmoking().smoking();
	}
}

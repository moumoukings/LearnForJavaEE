package Prog;

public class TestArgument {
	public static void main(String[] args) {
		Student s = new Student();
		noSmoking(s);
		
		//匿名
		noSmoking(new Student());
	}
	
	public static void noSmoking(Smoking s) {
		s.smoking();
	}
}

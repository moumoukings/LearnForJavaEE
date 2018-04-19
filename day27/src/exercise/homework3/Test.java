package exercise.homework3;

public class Test {
	public static void main(String[] args) {
		ChouJiang cj = new ChouJiang();
		
		Thread t1 = new Thread(cj,"一号");
		Thread t2 = new Thread(cj,"二号");
		
		t1.start();
		t2.start();
	}
}

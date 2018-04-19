package exercise.threah;

public class Demo {
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo("新的线程");
		
		td.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("main线程:"+i);
		}
	}
}

package Prog;

public class Test {
	public static void main(String[] args) {
		Worker w = new Worker("南山南", 12);
		System.out.println(w.getName());
		System.out.println(w.getAge());
		
		System.out.println("========");
		
		Student s = new Student("多少", 2);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}

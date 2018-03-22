package Exercise.yi.demo2;

public class Test {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		
		t.setName("安安");
		t.setAge(34);
		t.work();
		System.out.println("=============");
		Student s = new Student();
		
		s.setName("球球");
		s.setAge(10);
		s.work();
	}
}

package Prog;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		//调用set方法，赋值
		p.setName("老李头");
		p.setAge(88);
		p.speak();
		
		//调用get方法,查看
		System.out.println(p.getName()+"****"+p.getAge());
	}
}

package Prog;

public class Person {
	//私有变量
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0 || age > 200) {
			System.out.println("您输入的年龄有误！");
		} else {			
			this.age = age;
		}
	}
	public void speak() {
		System.out.println(this.name+"在说话,他已经"+this.age+"岁了!");
	}
}
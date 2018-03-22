package Exercise.yi.demo2;

/*
	属性:姓名,年龄
	行为:吃饭
*/

public class Gong_gong {
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
		this.age = age;
	}

	public void work() {
		System.out.println(this.getName()+"在吃饭。");
		System.out.println("年龄："+this.getAge());
	}
}

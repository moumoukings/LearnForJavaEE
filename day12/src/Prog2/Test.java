package Prog2;

public class Test {
	public static void main(String[] args) {
		JavaEE j = new JavaEE("张三", 0231);
		j.work();
		
		System.out.println("=========");
		
		Net i = new Net(null, 0);
		i.setName("三打");
		i.setId(0321);
		i.work();
	}
}

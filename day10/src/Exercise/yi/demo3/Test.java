package Exercise.yi.demo3;

public class Test {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setcolor("白猫");
		c.setnamber(4);
		c.work();
		
		System.out.println("===========");
		
		Dog d = new Dog();
		d.setcolor("黑狗");
		d.setnamber(3);
		d.work();
	}
}

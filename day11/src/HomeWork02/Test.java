package HomeWork02;

public class Test {
	public static void main(String[] args) {
		//测试OldPhone方法
		OldPhone o = new OldPhone();
		o.call();
		o.sendMessage();
		System.out.println("========");
		
		//测试NewPhone方法
		NewPhone n = new NewPhone();
		n.call();
		n.sendMessage();
		n.playGame();
	}
}

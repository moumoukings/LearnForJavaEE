package Home_Work;

/*
 * 	A:求两个数的和。	
 * 	B:判断两个数是否相等。
 * 	C:输出九九乘法表。
 * 
 */

public class Demo {
	private int a;
	private int b;
	private int sum;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	//A:求两个数的和。
	public void sum1(int a,int b) {
		sum = a + b;
		System.out.println(this.a+"和"+this.b+"的和是："+this.sum);
	}
	
	//B:判断两个数是否相等。
	public void pan1(int a,int b) {
		if (this.a == this.b) {
			System.out.println("这两个数相等！");
		} else {
			System.out.println("不相等！");
		}
	}
	
	//C:输出九九乘法表。
	public void Jiu() {
		for(int i = 1;i <= 9; i++) {
			for(int j = 1;j <= i; j++ ) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}

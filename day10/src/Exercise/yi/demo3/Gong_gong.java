package Exercise.yi.demo3;

/*
	属性:毛的颜色,腿的个数
	行为:吃饭
*/

public class Gong_gong {
	private String color;
	private int namber;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public int getnamber() {
		return namber;
	}
	public void setnamber(int namber) {
		this.namber = namber;
	}

	public void work() {
		System.out.println(this.getcolor()+"在吃饭。");
		System.out.println("它有"+this.getnamber()+"条腿。");
	}
}

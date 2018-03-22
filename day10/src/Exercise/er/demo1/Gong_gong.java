package Exercise.er.demo1;

/*
	属性:毛的颜色,腿的个数
	行为:吃饭
*/

public abstract class Gong_gong {
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
	
	public abstract void work();
}

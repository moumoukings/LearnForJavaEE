package Exercise.yi.demo1;

public class Jing_li {
	private String name;//名字
	private String id;//工号
	private double	price;//工资
	private double	jiang;//奖金
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getJiang() {
		return jiang;
	}
	public void setJiang(double jiang) {
		this.jiang = jiang;
	}
	
	public void work() {
		System.out.println("姓名："+this.getName());
		System.out.println("工号："+this.getId());
		System.out.println("工资："+this.getPrice());
		System.out.println("奖金："+this.getJiang());
	}
}

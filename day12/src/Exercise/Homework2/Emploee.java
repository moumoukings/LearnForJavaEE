package Exercise.Homework2;

public class Emploee {
	private String name; 
	private int id;
	private double salary;
	
	public Emploee() {
		super();
	}
	public Emploee(String name,int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary =salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	public void show() {
		System.out.println("姓名："+this.name);
		System.out.println("工号："+this.id);
		System.out.println("工资："+this.salary);
	}
}

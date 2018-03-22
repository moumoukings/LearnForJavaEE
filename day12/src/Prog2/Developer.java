package Prog2;

public abstract class Developer extends Employee {
	public Developer(String name,int id) {
		super(name,id);
	}
	
	public abstract void work();
}

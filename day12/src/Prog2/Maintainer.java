package Prog2;

public abstract class Maintainer extends Employee {
	public Maintainer(String name,int id) {
		super(name,id);
	}
	
	public abstract void work();
}

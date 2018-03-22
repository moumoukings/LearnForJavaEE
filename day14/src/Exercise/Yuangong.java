package Exercise;
/*
 * 员工:
 *  属性：
 * 		  工号 	String ID
 * 	   	  姓名 	String name
 * 	方法: 工作		work()
 */
public abstract class Yuangong {
	private String ID;
	private String name;
	
	//构造方法
	public Yuangong() {
		super();
	}
	public Yuangong(String ID,String name) {
		super();
		this.ID = ID;
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//定义方法工作
	public abstract void work();
}

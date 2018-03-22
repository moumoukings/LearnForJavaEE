package Prog;
/*
 	工作内容:
		JavaEE工程师：员工号为xxx的 xxx员工，正在研发淘宝网站
		Android工程师：员工号为xxx的 xxx员工，正在研发淘宝手机客户端软件
		网络维护工程师：员工号为xxx的 xxx员工，正在检查网络是否畅通
		硬件维护工程师：员工号为xxx的 xxx员工，正在修复打印机

 */
public abstract class Employee {
	private String id;//员工号
	private String name;//员工名
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//定义工作方法
	public abstract void work();
}

package Exercise.yi.demo2;
/*
  	老师有特有的方法:讲课
 */
public class Teacher extends Gong_gong {
	
	public void work() {
		super.work();
		System.out.println(this.getName()+"在讲课。");
	}
}

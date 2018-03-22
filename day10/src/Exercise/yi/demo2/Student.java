package Exercise.yi.demo2;
/*
  	学生有特有的方法:学习
 */
public class Student extends Gong_gong {
	public void work() {
		super.work();
		System.out.println(this.getName()+"在学习。");
	}
}

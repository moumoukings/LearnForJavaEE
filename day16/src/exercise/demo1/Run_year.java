package exercise.demo1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 闰年计算：
 * 	方法：	日历设置到指定年的3月1号，add向前偏移一天，获取天数，29就是闰年
 */
public class Run_year {
	public static void main(String[] args) {
		System.out.println("请输入要判断的年：");
		function();
	}
	public static void function() {
		//将日历指定到某年3月1号
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Calendar c =Calendar.getInstance();
		//月数与实际少一天
		c.set(year, 2, 1);
		sc.close();
		//add方法，将天数向前偏移一天
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		if(day == 29) {
			System.out.println(year+"是润年");
		}else if( day == 28 ){
			System.out.println(year+"是平年");
		}
	}
}

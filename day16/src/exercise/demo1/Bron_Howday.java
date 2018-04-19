package exercise.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 要求：
 * 	求出自己出生了多少天
 * 方案：
 * 	1.获取当前日期==>对应的天数	today
 * 	2.获取本人出生日期的毫秒值==>对应天数	before
 * 	3.today - before = 你已经活的天数
 */
public class Bron_Howday {
	public static void main(String[] args) throws Exception {
		function();
	}
	public static void function() throws Exception {
		System.out.println("请输入出生日期 格式YYYY-MM-dd");
		Scanner sc = new Scanner(System.in);
		String birthday = sc.nextLine();
	
		//将日期格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//将字符串日期转化为Date对象
		Date birthdayDate = sdf.parse(birthday);
	
		//获取今天的日期
		Date todayDate = new Date();
		long befor = birthdayDate.getTime();
		long today = todayDate.getTime();
		long day1 = today - befor;
		
		if(day1 < 0) {
			System.out.println("你还没出生。");
		}else {			
		//将毫秒值（活的天数）转为天
		long day2 = day1/86400000;
		sc.close();
		System.out.println("你已经活了"+day2+"天。 ");
		}
	}
}

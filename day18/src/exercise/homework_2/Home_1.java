package exercise.homework_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*	1.分析以下需求，并用代码实现：
		(1)通过键盘录入日期字符串，格式(2015-10-20)
		(2)输出该日期是星期几及这一年的第几天
		(3)如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是  2015年的第 293 天"*/
// 1、名字(见名知意 )   2、尽量考虑使用面向对象思想来写代码    3、 尽量考虑代码的复用性

public class Home_1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String dateStr = sc.nextLine();
		//调用方法，实现：输出该日期是星期几及这一年的第几天
		printDate(dateStr);
		sc.close();
	}
	//定义方法：实现输出该日期是星期几及这一年的第几天
	public static void printDate(String dateStr) throws Exception {
		//设置日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//将输入的字符串变成日期
		Date date = sdf.parse(dateStr);
//		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日");
		//将日期转换为字符串
		String f = sdf2.format(date);
//		System.out.println(f);
		
		//调用日历类，提取字段（年 月 日 星期 该年的第几天）
		Calendar c = Calendar.getInstance();
		c.setTime(date);//存入日期
		int year = c.get(Calendar.YEAR);//获取年
		int week = c.get(Calendar.DAY_OF_WEEK);//获取星期
		int day = c.get(Calendar.DAY_OF_YEAR);//获取该年的第几天
		
		//输出方式：2015年-10月-20日 是 星期二，是  2015年的第 293 天
		System.out.println(f+" 是"+convert(week)+",并且是"+year+"年的第"+day+"天");
	}
	//将数字转为中文版的星期数
	public static String convert(int week) {
		String[] str = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return str[week];
	}
}

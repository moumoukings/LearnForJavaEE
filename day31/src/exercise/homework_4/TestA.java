package exercise.homework_4;

import java.lang.reflect.Method;
import java.util.Scanner;
/*
 * 在编写一个类TestA ,作为客户端，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，
	并调用该对象中的方法showString
 */
public class TestA {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个类的全类名,用.隔开:");
		String className = sc.nextLine();
		
		Class c = Class.forName(className);
		A a = (A)c.newInstance();
		Method method = c.getMethod("showString");
		method.invoke(a);
	}
}

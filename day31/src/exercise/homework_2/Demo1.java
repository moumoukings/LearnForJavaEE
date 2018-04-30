package exercise.homework_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("exercise.homework_2.Student");
		//1.创建一个空对象
		Student student = (Student)c.newInstance();
		/*
		//方式一:
		//2.获取字段
		Field age = c.getDeclaredField("age");
		Field name = c.getDeclaredField("name");
		//获取私有属性
		age.setAccessible(true);
		name.setAccessible(true);
		//3.给字段设置值
		age.set(student, 30);
		name.set(student, "绽放");
		System.out.println(student);*/
		
		/*
		//方式二
		Method setAge = c.getMethod("setAge", int.class);
		Method setName = c.getMethod("setName", String.class);
		setName.invoke(student, "砸死");
		setAge.invoke(student, 80);
		System.out.println(student);*/
		
		//方式三
		Constructor constructor = c.getConstructor(String.class,int.class);
		Student stu = (Student) constructor.newInstance("咋的",31);
		System.out.println(stu);
	}
}

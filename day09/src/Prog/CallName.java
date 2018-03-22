package Prog;

import java.util.ArrayList;
import java.util.Random;

/*
 * 1.创建集和，将学生对象存储到集和中
 * 2.浏览所有学生信息
 * 3.随机一个学生（利用随机数）
 * 
 */
public class CallName {
	
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		lookStudent(array);
		randomStudent(array);
	}
	
	//定义方法，随机数生成学生信息
	public static void randomStudent(ArrayList<Student> array) {
		Random r = new Random();
		int index = r.nextInt(array.size());
		Student s = array.get(index);
		System.out.println("*********************");
		System.out.println(s.getName()+"==="+s.getAge());
	}
	
	//定义方法，浏览学生
	public static void lookStudent(ArrayList<Student> array) {
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+"==="+s.getAge());
		}
	}
	
	//定义方法，添加学生
	public static void addStudent(ArrayList<Student> array) {
		Student s1 = new Student();
		s1.setName("丽水1");
		s1.setAge(10);
		
		Student s2 = new Student();
		s2.setName("丽水2");
		s2.setAge(20);
		
		Student s3 = new Student();
		s3.setName("丽水3");
		s3.setAge(30);
		
		Student s4 = new Student();
		s4.setName("丽水4");
		s4.setAge(40);
		
		Student s5 = new Student();
		s5.setName("丽水5");
		s5.setAge(50);
		
		//加入集和中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
	}
}

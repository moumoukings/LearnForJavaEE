package fuxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import exercise.home_work1.Student;

public class Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> list = new ArrayList<Student>();
		/*//1.添加学生信息
		studentAdd(list);
		
		//2.将学生信息写入D:\测试文件夹\day25\Student.txt
		writeStudent(list);*/
		
		//3.读取D:\测试文件夹\day25\Student.txt文件中的ArrayList对象
		list = readStudent(list);
		//4.对新获取的ArrayList集合中的6个学生对象进行去重
		list = sortStudent(list);
		//5.将ArrayList集合中排序后的结果利用PrintWriter流写入到E:\\StudentInfo.txt文件中(写入格式：张三-男-25)
		writeStudentInfo(list);
	}

	private static void writeStudentInfo(ArrayList<Student> list) throws IOException {
		PrintWriter pw = new PrintWriter(new File("D:\\测试文件夹2\\StudentInfo.txt"));
		for (Student s : list) {
			pw.println(s.getName()+"-"+s.getGender()+"-"+s.getAge());
		}
		pw.close();
	}

	private static ArrayList<Student> sortStudent(ArrayList<Student> list) {
		//Hashset集合去重
		HashSet<Student> set = new HashSet<Student>();
		ArrayList<Student> stu = new ArrayList<Student>();
		set.addAll(list); 
		//从小到大排序
		TreeSet<Student> students = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getAge()<o2.getAge()?-1:1;
			}
		});
		//从新添加数据到stu集合
		for (Student s : set) {
			students.add(s);
		}
		
		for (Student s : students) {
			stu.add(s);
		}
		return stu;
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<Student> readStudent(ArrayList<Student> list) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File("D:\\测试文件夹\\day25\\Student.txt"));
		ObjectInputStream is = new ObjectInputStream(fis);
		list = (ArrayList<Student>)is.readObject();
		//遍历集合
		for (Student stu : list) {
			System.out.println(stu);
		}
		is.close();
		return list;
	}

	@SuppressWarnings("unused")
	private static void writeStudent(ArrayList<Student> list) throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("D:\\测试文件夹\\day25\\Student.txt"));
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(list);
		os.flush();
		os.close();
	}

	@SuppressWarnings("unused")
	private static ArrayList<Student> studentAdd(ArrayList<Student> list) {
		//输入学生信息(6人) 格式： 张三,80,15
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 6;i++) {
			//添加学生
			String str = sc.nextLine();
			//按","分割存入String数组
			String[] s = str.split(",");
			Student stu = new Student(s[0], s[1], Integer.parseInt(s[s.length-1]));
			list.add(stu);
		}
		sc.close();
		return list;
	}
}

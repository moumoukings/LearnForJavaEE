package exercise.home_work1;

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

//import exercise.home_work2.Student;
/*
张三,男,25
张是,女,25
张三,男,25
六三,男,21
三,男,5
张三是,男,2
*/
public class StudentDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		//1.添加学生信息
		//studentAdd(list);
		
		//2.将学生信息写入D:\测试文件夹\day25\Student.txt
		//writeStudentInfo(list);
		
		//3.读取D:\测试文件夹\day25\Student.txt文件中的ArrayList对象
		list =readStudentInof(list);
		
		//4.对ArrayList集合中的6个学生对象进行去重
		//并按照年龄从小到大的顺序排序
		list =sortStudentInfo(list);
		
		//5.将ArrayList集合中排序后的结果利用PrintWriter流写入到E:\\StudentInfo.txt文件中(写入格式：张三-男-25)
		writeStudentInfoToFile(list);
	}
	/*
	 * (5)
	 */
	public static void writeStudentInfoToFile(ArrayList<Student> list) throws IOException {
		PrintWriter pw = new PrintWriter(new File("D:\\测试文件夹2\\StudentInfo.txt"));
		for (Student s : list) {
			pw.println(s.getName()+"-"+s.getGender()+"-"+s.getAge());
			pw.flush();
		}
		pw.close();
		
	}
	/*
	 *	(4)对ArrayList集合中的6个学生对象进行去重
	 * 	        并按照年龄从小到大的顺序排序
	 */
	public static ArrayList<Student> sortStudentInfo(ArrayList<Student> list) {
		//利用Hashset特性去重
		HashSet<Student> set = new  HashSet<Student>();
		ArrayList<Student> stu = new ArrayList<Student>();
		set.addAll(list);
		//从小到大排序
		TreeSet<Student> students = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
						return o1.getAge() < o2.getAge() ? -1 : 1;
					}
			});
		//重新添加数据到stu集合
		for (Student s : set) {
			students.add(s);
		}
		
		for (Student s : students) {
			stu.add(s);
		}
		return stu;
	}
	/*
	 * (3)读取D:\测试文件夹\day25\StudentInfo.txt文件中的ArrayList对象
	 * 
	 * 	利用反序列化
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<Student> readStudentInof(ArrayList<Student> list) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File("D:\\测试文件夹\\day25\\Student.txt"));
		//反序列化,读取对象
		ObjectInputStream ois = new ObjectInputStream(fis);
		list = (ArrayList<Student>)ois.readObject();
		for (Student stu : list) {
			System.out.println(stu);
		}
		ois.close();
		return list;
	}
	/*
	 * (2)将存有6个学员信息的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
	 */
	public static void writeStudentInfo(ArrayList<Student> list) throws IOException {
			FileOutputStream fos = new FileOutputStream(new File("D:\\测试文件夹\\day25\\Student.txt"));
			//OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			//序列化，将对象写入文件中 
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(list);
			os.flush();
			os.close();
			
	}
	
	/*
	 * (1)键盘录入6个学员信息(录入格式:张三,男,25)
	 *   要求有两个相同的信息
	 *   将6个学员信息存入到ArrayList集合中
	 */
	//定义添加学生信息方法
	public static ArrayList<Student> studentAdd(ArrayList<Student> list) {
		System.out.println("请输入6个学员信息(录入格式:张三,男,25):");
		Scanner sc = new Scanner(System.in);
			for(int i = 0;i < 6;i++) {
				String str = sc.nextLine();
				//按逗号切割
				String[] s = str.split(",");
				Student stu = new Student(s[0], s[1], Integer.parseInt(s[s.length-1]));
				list.add(stu);
			}
			sc.close();
			return list;
	}
}

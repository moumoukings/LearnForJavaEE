package exercise.homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercise.utils.JDBCUtils;

public class Demo1 {
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;

	public static void main(String[] args) throws SQLException, IOException {
		con = JDBCUtils.getConnection();
		// 查询女性,成绩80以上的学生数量
		// getResult_1();
		// 将姓张的男同学的的成绩改为100
		// getResult_2();
		// 查询成绩大于60的女性,显示姓名,性别,成绩
		// getResult_3();
		// 分别统计所有男同学的平均分，所有女同学的平均分及总平均分
		// getResult_4();
		/*
		 * 按照分数从小到大的顺序打印分数大于总平均分的学员信息(id-name-sex-score),
		 * 并将分数大于总平均分的学员信息(按照分数从小到大的顺序)(id-name-sex-score)
		 * 写入到studentInfo.txt文件中(写入格式：id-name-sex-score)
		 */
		 getResult_5();
		// 定义查询所有学生的方法public List<Student> getAllStudent(){}
		/*
		 * List<Student> students = getAllStudent(); for (Student s : students) {
		 * System.out.println(s.getId() + "  " + s.getName() + "  " + s.getSex() + "  "
		 * + s.getScore()); }
		 */
		// 定义根据id查询学生的方法public Student getStudentById(String id){}
		/*
		 * Student s = getStudentById("1"); System.out.println(s);
		 */
		// 定义根据id删除学生的方法public int deleteStudentById(String id){}(只有数据库中有才能删除，没有无法删除)
		/*
		 * int i = deleteStudentById("1"); System.out.println(i);
		 */
		// 定义添加学员的方法public int addStudent(){}(只有数据库中没有有才能添加，有无法添加)
		//addStudent();
		//定义根据id修改学员的信息public int updateStudentById(String id){}//(只有数据库中有才能修改，没有无法修改)
		/*int i = updateStudentById("1");
		if(i != 0) {
			System.out.println("修改成功!");
		}else {
			System.out.println("修改失败!");
		}*/
	}

	public static int updateStudentById(String id) throws SQLException {
		String sql = "UPDATE student SET name=?,sex=?,score=? WHERE id=?";
		ps = con.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改学员的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入要修改学员的性别：");
		String sex = sc.nextLine();		
		System.out.println("请输入要修改学员的成绩：");
		int score = sc.nextInt();
		ps.setString(1, name);
		ps.setString(2, sex);
		ps.setInt(3, score);
		ps.setString(4, id);
		
		int count = ps.executeUpdate();
		sc.close();
		JDBCUtils.close(con, ps);
		return count;
	}

	public static int addStudent() throws SQLException {
		String sql = "INSERT INTO student(name,sex,score) VALUES(?,?,?)";
		ps = con.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要添加学员的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入要添加学员的性别：");
		String sex = sc.nextLine();		
		System.out.println("请输入要添加学员的成绩：");
		int score = sc.nextInt();
		ps.setString(1, name);
		ps.setString(2, sex);
		ps.setInt(3, score);
		
		int count = ps.executeUpdate();
		sc.close();
		JDBCUtils.close(con, ps);
		return count;
	}

	public static int deleteStudentById(String id) throws SQLException {
		String sql = "DELETE FROM student WHERE id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		int count = ps.executeUpdate();
		return count;
	}

	public static Student getStudentById(String id) throws SQLException {
		String sql = "SELECT * FROM student WHERE id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		rs = ps.executeQuery();
		Student s = null;
		if (rs.next()) {
			int sid = Integer.parseInt(id);
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			int score = rs.getShort("score");
			s = new Student(sid, name, sex, score);
		}
		JDBCUtils.close(con, ps, rs);
		return s;
	}

	public static List<Student> getAllStudent() throws SQLException {
		List<Student> students = new ArrayList<Student>();
		String sql = "SELECT * FROM student";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			int score = rs.getInt("score");
			Student s = new Student(id, name, sex, score);
			students.add(s);

		}
		return students;
	}

	public static void getResult_5() throws SQLException, IOException {
		// 获取总成绩的平均分
		String sql = "select * From student where score>(SELECT AVG(score) FROM student) order by score";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		// 打印流"studentInfo.txt"
//		PrintWriter pw = new PrintWriter(new FileWriter(new File("D:\\测试文件夹\\studentInfo.txt")));
		PrintWriter pw = new PrintWriter(new FileWriter("studentInfo.txt"));
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String score = rs.getString("score");
			pw.println(id + "——" + name + "——" + sex + "——" + score);
		}
		// 关流
		pw.close();
		JDBCUtils.close(con, ps, rs);
	}

	// 分别统计所有男同学的平均分，所有女同学的平均分及总平均分
	public static void getResult_4() throws SQLException {
		String sql = "SELECT AVG(score),sex FROM student GROUP BY sex";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			String sex = rs.getString("sex");
			String avg = rs.getString("AVG(score)");
			System.out.println(sex + " " + avg);
		}
	}

	// 查询成绩大于60的女性,显示姓名,性别,成绩
	public static void getResult_3() throws SQLException {
		String sql = "SELECT NAME,sex,score FROM student WHERE sex=? AND score>?";
		ps = con.prepareStatement(sql);
		ps.setString(1, "女");
		ps.setInt(2, 60);
		rs = ps.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String score = rs.getString("score");
			System.out.println("姓名：" + name + " 性别：" + sex + " 成绩：" + score);
		}
		JDBCUtils.close(con, ps, rs);
	}

	// 将姓张的男同学的的成绩改为100
	public static void getResult_2() throws SQLException {
		String sql = "UPDATE student SET score=? WHERE name like ? and sex=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, 100);
		ps.setString(2, "张%");
		ps.setString(3, "男");
		ps.executeUpdate();
		JDBCUtils.close(con, ps);
	}

	// 查询女性,成绩80以上的学生数量
	public static void getResult_1() throws SQLException {
		String sql = "SELECT * FROM `student` WHERE sex=? and score>=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, "女");
		ps.setInt(2, 80);
		rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "  " + rs.getString("name") + "   " + rs.getString("sex") + "   "
					+ rs.getInt("score"));
		}
		JDBCUtils.close(con, ps, rs);
	}
}

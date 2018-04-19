package program.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/*
 *  Java程序实现用户登录,用户名和密码,数据库检查
 *  防止注入攻击
 *  Statement接口实现类,作用执行SQL语句,返回结果集
 *  有一个子接口PreparedStatement  (SQL预编译存储,多次高效的执行SQL) 
 *  PreparedStatement的实现类数据库的驱动中,如何获取接口的实现类
 *  
 *  是Connection数据库连接对象的方法
 *  PreparedStatement prepareStatement(String sql)         
 */
public class JDBCDemo4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.注册驱动 反射技术,将驱动类加入到内容
		Class.forName("com.mysql.jdbc.Driver");
		// 2.获得数据库连接 DriverManager类中静态方法
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();

		// 调用Connection接口的方法prepareStatement,获取PrepareStatement接口的实现类
		// 方法中参数,SQL语句中的参数全部采用问号占位符
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?";
		PreparedStatement pst = con.prepareStatement(sql);

		// 调用pst对象set方法,设置问号占位符上的参数
		pst.setObject(1, user);
		pst.setObject(2, pass);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("username")+"   "+rs.getString("password"));
		}
		
		pst.close();
		rs.close();
		sc.close();
	}
}

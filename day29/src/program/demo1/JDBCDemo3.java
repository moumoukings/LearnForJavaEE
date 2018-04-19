package program.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*
 *  Java程序实现用户登录,用户名和密码,数据库检查
 *  演示被别人注入攻击
 */
public class JDBCDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.注册驱动 反射技术,将驱动类加入到内容
		Class.forName("com.mysql.jdbc.Driver");
		// 2.获得数据库连接 DriverManager类中静态方法
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		// 3.获得语句执行平台, 通过数据库连接对象,获取到SQL语句的执行者对象
		Statement stat = con.createStatement();
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		// 4.执行sql语句
		String sql = "SELECT * FROM users WHERE username='"+user+"' AND PASSWORD='"+pass+"'";
		ResultSet rs = stat.executeQuery(sql);
		// 5.处理结果
		while(rs.next()) {
			System.out.println(rs.getString("username")+"   "+rs.getString("password"));
		}
		// 6.释放资源
		sc.close();
		rs.close();
		stat.close();
		con.close();
	}
}
/*
 * 当输入用户名a 密码为 1 'or' 1=1时，此时发生数据库代码注入
	a
	a 'or' 1=1
	a   1
	b   2
*/

package program.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.注册驱动 反射技术,将驱动类加入到内容
		// 使用java.sql.DriverManager类静态方法 registerDriver(Driver driver)
		// Diver是一个接口,参数传递,MySQL驱动程序中的实现类
		// DriverManager.registerDriver(new Driver());
		// 驱动类源代码,注册2次驱动程序
		Class.forName("com.mysql.jdbc.Driver");

		// 2.获得数据库连接 DriverManager类中静态方法
		// static Connection getConnection(String url, String user, String password)
		// 返回值是Connection接口的实现类,在mysql驱动程序
		// url: 数据库地址 jdbc:mysql://连接主机IP:端口号//数据库名字
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		// 3.获得语句执行平台, 通过数据库连接对象,获取到SQL语句的执行者对象
		// con对象调用方法 Statement createStatement() 获取Statement对象,将SQL语句发送到数据库
		// 返回值是 Statement接口的实现类对象,,在mysql驱动程序
		Statement stat = con.createStatement();

		// 4.执行sql语句
		// 通过执行者对象调用方法执行SQL语句,获取结果
		// ResultSet executeQuery(String sql)  执行SQL语句中的select查询
		// 返回值ResultSet接口的实现类对象,实现类在mysql驱动中
		String sql = "SELECT * FROM sort";
		ResultSet rs = stat.executeQuery(sql);
		
		// 5.处理结果
		// ResultSet接口方法 boolean next() 返回true,有结果集,返回false没有结果集
		while(rs.next()) {
			System.out.println(rs.getInt("sid")+"  "+rs.getString("sname")+"   "+rs.getString("sprice"));
		}
		
		// 6.释放资源.
		rs.close();
		stat.close();
		con.close();
	}
}

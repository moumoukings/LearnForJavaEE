package program.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import program.jdbcutil.JDBCUtilsConfig;

public class PropertiesDemo {
	public static void main(String[] args) throws SQLException {
		//链接数据库
		Connection con = JDBCUtilsConfig.getConnection();
		String sql = "SELECT * FROM sort";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("sid")+"  "+rs.getString("sname")+"   "+rs.getString("sprice"));
		}
		JDBCUtilsConfig.close(con, pst,rs);
	}
}

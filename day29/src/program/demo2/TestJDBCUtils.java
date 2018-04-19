package program.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import program.jdbcutil.JDBCUtils;

public class TestJDBCUtils {
	public static void main(String[] args) throws SQLException {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM sort");
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("sid")+"  "+rs.getString("sname")+"   "+rs.getString("sprice"));
		}
		JDBCUtils.close(con, pst, rs);
	}
}

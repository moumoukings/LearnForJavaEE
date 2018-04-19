package exercise.homework1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import exercise.utils.JDBCUtils;

public class Demo1 {
	private static Connection con;
	private static PreparedStatement pst;
	private static ResultSet rs;

	public static void main(String[] args) throws SQLException {
		Map<String, String> map = new HashMap<String, String>();
		// 将用户和密码存入map集合
		map.put("liuyan", "123456");
		map.put("wangbaoqiang", "123321");
		map.put("fangbian", "abcd");
		map.put("miejueshitai", "123abc321");

		// 创建Set集合，并遍历
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			// 取键
			String key = it.next();
			// 取值
			String value = map.get(key);
			System.out.println(key + "..." + value);
		}
		// 链接数据库
		con = JDBCUtils.getConnection();
		// 获取数据库中的用户名和密码
		for (String username : keySet) {
			if (findByUsername(username)) {
				System.out.println(username + "该用户已存在");
			} else {
				registUser(username, map.get(username));
				System.out.println("成功注册用户" + username);
			}
		}
		JDBCUtils.close(con, pst, rs);
	}

	private static boolean findByUsername(String username) throws SQLException {
		String sql = "SELECT * FROM userinfo where username=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);	
		rs = pst.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

	public static void registUser(String username, String password) throws SQLException {
		String sql = "INSERT INTO userinfo(username,password) values(?,?)";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2, password);
		pst.executeUpdate();
	}
}

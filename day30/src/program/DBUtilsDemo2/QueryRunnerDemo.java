package program.DBUtilsDemo2;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import program.jdbcutils.JDBCUtils_DBCP;



public class QueryRunnerDemo {
	private static QueryRunner qr = new QueryRunner(JDBCUtils_DBCP.getDataSource());
	public static void main(String[] args) {
		//添加数据
		//insert();
		//查询数据
		select();
	}

	private static void select() {
		String sql = "SELECT * FROM sort";
		try {
			List<Object[]> list = qr.query(sql, new ArrayListHandler());
			for (Object[] objs : list) {
				for (Object obj : objs) {
					System.out.print(obj+"  ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("数据查找失败");
		}
	}

	private static void insert() {
		String sql = "INSERT INTO sort (sname,sprice,sdesc)VALUES(?,?,?)";
		Object[] params = {"水果",100.12,"刚刚上市的核桃"};
		try {
			int row = qr.update(sql, params);
			System.out.println(row);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("数据添加失败");
		}
		
	}
}	

package program.DBUtilsDemo1;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import program.jdbcutils.JDBCUtils;

public class QueryRunner_Demo {
	private static Connection con = JDBCUtils.getConnection();
	
	public static void main(String[] args) throws SQLException {
		//数据添加
		//insert();
		//数据更新
		//update();
		//数据删除
		delete();
	}

	/*
	 *  定义方法,使用QueryRunner类的方法delete将数据表的数据删除
	 */
	public static void delete() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "DELETE FROM sort WHERE sid=?";
		//Object params = 8;
		int row = qr.update(con, sql, 8);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}

	/*
	 *  定义方法,使用QueryRunner类的方法update将数据表的数据修改
	 */
	public static void update() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "UPDATE sort SET sname=?,sprice=?,sdesc=? WHERE sid=?";
		Object[] params = {"体育品",200.20,"体育买",8};
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}

	/*
	 * 定义方法,使用QueryRunner类的方法update向数据表中,添加数据
	 */
	public static void insert() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES (?,?,?)"; 
		Object[] params = {"体育用品",200,"体育购买"};
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
}

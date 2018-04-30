package com.gjp.tools;
/*
 * 获取数据库连接工具
 * 实现连接，dbcp连接池
 */

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	//创建BasicDataSource对象
	private static BasicDataSource dataSource = new BasicDataSource();
	//静态代码块，实现必要参数的设置
	static {
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/gjp");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(5);
		dataSource.setMinIdle(2);
		dataSource.setInitialSize(10);
	}
	public static DataSource getDataSource() {
		return dataSource;
	}
}

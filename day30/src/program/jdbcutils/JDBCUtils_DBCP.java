package program.jdbcutils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils_DBCP {
	// 创建出BasicDataSource类对象
	private static BasicDataSource datasource = new BasicDataSource();

	// 静态代码块,对象BasicDataSource对象中的配置,自定义
	static {
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/mybase");
		datasource.setUsername("root");
		datasource.setPassword("root");
		// 对象连接池中的连接数量配置,可选的
		datasource.setInitialSize(10);// 初始化的连接数
		datasource.setMaxActive(8);// 最大连接数量
		datasource.setMaxIdle(5);// 最大空闲数
		datasource.setMinIdle(1);// 最小空闲
	}

	public static DataSource getDataSource() {
		return datasource;
	}
}

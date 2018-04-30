package com.gjp.dao;
/*
 * 实现对类的怎删改查操作
 * dbutils工具类完成，类成员创建QueryRunner,指定数据源
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.gjp.domain.ZhangWu;
import com.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	/*
	 * 定义方法，实现删除业务
	 * 业务层调用，传递主键id
	 */
	public void deleteZhangWu(int zwid) {
		try {
			String sql = "DELETE FROM gjp_zhangwu WHERE zwid=?";
			qr.update(sql, zwid);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("删除账务失败");
		}
	}
	
	/*
	 * 定义方法，实现编辑功能 由业务层调用，传递ZhangWu对象 将对象中的数据，更新到数据表
	 */
	public void editZhangWu(ZhangWu zw) {
		try {
			String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhangHu=?,createtime=?,description=? WHERE zwid=?";
			Object[] params = { zw.getFlname(), zw.getMoney(), zw.getZhangHu(), zw.getCreatetime(), zw.getDescription(),
					zw.getZwid() };
			qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("编辑账务失败");
		}
	}
	
	/*
	 * 定义方法，实现添加账务功能
	 * 由业务层调用，传递ZhangWu对象
	 * 将ZhangWu对象中的数据，添加到数据库
	 */
	public void addZhangWu(ZhangWu zw) {
		try {
			String sql = "INSERT INTO gjp_zhangwu (flname,money,zhangHu,createtime,description) VALUES(?,?,?,?,?)";
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription()};
		
			qr.update(sql,params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("账务添加失败");
		}
	}
	
	/*
	 * 定义方法,查询数据库,获取所有的账务数据
	 * 方法,由业务层调用
	 * 结果集,将所有的账务数据,存储到Bean对象中,存储到集合中
	 */
	public List<ZhangWu> selectAll() {
		String sql = "SELECT * FROM gjp_zhangwu";
		try {
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class));
			return list;
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("查询所有账务失败");
		}
	}
	
	/*
	 * 定义方法,查询数据库,带有条件去查询账务表
	 * 由业务层调用,查询结果集存储到Bean对象,存储到List集合
	 * 调用者传递2个日期字符串
	 */
	public List<ZhangWu> select(String startDate, String endDate) {
		try {
			String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
			Object[] params = {startDate,endDate};	
			return qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class),params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("条件查询失败");
		}
	}

}

package com.gjp.view;
import java.util.List;
import java.util.Scanner;

/*
 * 视图层，用户看到的操作界面
 * 数据传递给Controller层实现
 * 成员位置，创建controller对象
 */
import com.gjp.controller.ZhangWuController;
import com.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			// 接收用户的选择
			int choose = sc.nextInt();
			//sc.close();
			switch (choose) {
			//选择添加账务，调用添加账务的方法
			case 1:
				addZhangWu();
				break;
			//选择编辑账务，调用编辑账务的方法
			case 2:
				editZhangWu();
				break;
			//选择删除账务，调用删除账务的方法
			case 3:
				deleteZhangWu();
				break;
			//选择查询账务，打野查询账务的方法
			case 4:
				selectZhangWu();
				break;
			//退出程序
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("输入错误！");
				break;
			}
		}
	}

	/*
	 * 定义方法，实现账务删除
	 * 实现思想：
	 * 	接收用户的输入，输入一个主键数据
	 *  调用控制层方法，传递一个主键
	 */
	public void deleteZhangWu() {
		//调用查询所有账务数据的功能，显示出来
		//看到所有数据，从中选择一项，进行修改
		selectAll();
		System.out.println("请选择删除数据的ID!");
		Scanner sc = new Scanner(System.in);
		int zwid = sc.nextInt();
		controller.deleteZhangWu(zwid);
		System.out.println("删除成功!");	
	}

	/*
	 * 定义方法，实现对账务的编辑功能
	 * 实现思想：
	 * 	接收用户的输入的信息
	 *  封装成ZhangWu对象
	 *  调用控制层的方法，传递ZhangWu对象，实现编辑
	 * 
	 */
	public void editZhangWu() {
		//调用查询所有账务数据，用户看到所有数据，选择修改
		selectAll();
		System.out.println("请输入修改的数据!");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入ID:");
		int zwid = sc.nextInt();		
		System.out.print("输入分类名称:");
		String flname = sc.next();
		System.out.print("输入金额:");
		double money = sc.nextDouble();
		System.out.print("输入账户:");
		String zhangHu = sc.next();
		System.out.println("输入日期:格式XXXX-XX-xx");
		String createtime = sc.next();
		System.out.print("输入具体描述:");
		String description = sc.next();
		//将用户数据封装到ZhangWu对象中
		//用户输入的ID必须封装到对象中
		ZhangWu zw = new ZhangWu(zwid, flname, zhangHu, money, createtime, description);
		controller.editZhangWu(zw);
		System.out.println("修改成功!");
	}

	/*
	 * 定义方法addZhangWu
	 * 添加账务的方法，用户在界面中选择菜单1的时候调用、
	 * 实现思想：
	 * 	  接收键盘输入，5项输入，调用controller层方法
	 */
	public void addZhangWu() {
		System.out.println("选择的添加账务功能，请输入以下内容");
		Scanner sc = new Scanner(System.in);
		System.out.print("输入分类名称:");
		String flname = sc.next();
		System.out.print("输入金额:");
		double money = sc.nextDouble();
		System.out.print("输入账户:");
		String zhangHu = sc.next();
		System.out.println("输入日期:格式XXXX-XX-xx");
		String createtime = sc.next();
		System.out.print("输入具体描述:");
		String description = sc.next();
		//将接收到的数据，调用controller层的方法，传递参数，实现数据添加
		//将用户输入的所有参数，封装成ZhangWu对象
		ZhangWu zw = new ZhangWu(0, flname, zhangHu, money, createtime, description);
		controller.addZhangWu(zw);
		System.out.println("添加成功！");
	}

	/*
	 * 定义方法 selectZhangWu()
	 * 显示查询的方式 1 所有查询   2 条件查询
	 * 接收用户的选择
	 */
	private void selectZhangWu() {
		System.out.println("1.查询所有     2.按条件查询");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		//sc.close();
		switch (choose) {
		 //选择的查询所有,调用查询所有的方法
		case 1:
			selectAll();
			break;
		// 选的条件查询,调用带有查询条件的方法
		case 2:
			select();
			break;
		default:
			System.out.println("您输入的有误！");
			break;
		}
	}
	
	/*
	 * 定义方法,实现条件查询账务数据 提供用户的输入日期,开始日期结束日期 就2个日期,传递到controller层
	 * 调用controller的方法,传递2个日期参数 获取到controller查询的结果集,打印出来
	 */
	public void select() {
		System.out.println("选择条件查询,输入日期格式XXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入开始日期:");
		String startDate = sc.nextLine();
		System.out.print("请输入结果日期:");
		String endDate = sc.nextLine();
		//sc.close();
		List<ZhangWu> list = controller.select(startDate, endDate);
		if(list.size() != 0) {			
			print(list);
		}
		else {
			System.out.println("没有查询到数据");
		}
	}


	/*
	  * 定义方法,实现查询所有的账务数据
	  */
	public void selectAll() {
		//调用控制层中的方法,查询所有的账务数据
		List<ZhangWu> list = controller.selectAll();
		if(list.size() != 0) {			
			print(list);
		}
		else {
			System.out.println("没有查询到数据");
		}
	}
	
	//输出账务数据方法,接收List集合,遍历集合,输出表格
	private void print(List<ZhangWu> list) {
		// 输出表头
		System.out.println("ID\t类别\t账户\t金额\t时间\t\t说明");
		// 遍历集合,结果输出控制台
		for (ZhangWu zw : list) {
			System.out.println(zw.getZwid() + "\t" + zw.getFlname() + "\t" + zw.getMoney() + "\t" + zw.getZhangHu()
			+ "\t" + zw.getCreatetime() + "\t" + zw.getDescription());
		}
	}
}

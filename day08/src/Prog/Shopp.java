package Prog;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *   超市管理系统主
 *   实现:
 *     1. 商品数据的初始化
 *     2. 用户的菜单选择
 *     3. 根据选择执行不同的功能
 *       3.1 Read    查看商品
 *       3.2 Create  添加商品
 *       3.3 Delete  删除商品
 *       3.4 Update  修改商品
 *       
 *       
 *   所有功能 ,必须定义方法实现
 *   主方法main  调用作用
 */

public class Shopp {
	public static void main(String[] args) {
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		init(array);
		while (true) {
			mainMenu();
			int number = choose();
			switch (number) {
			case 1:
				showFruitList(array);
				break;
			case 2:
				addFruitItem(array);
				break;
			case 3:
				deleteFruit(array);
				break;
			case 4:
				updataFruit(array);
				break;
			case 5:
				return ;
			default:
				break;
			}
		}
	}
	
	private static int choose() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	/*
	 * 定义方法，实现显示功能清单
	 * 
	 */
	public static void mainMenu() {
		System.out.println();
		System.out.println("================欢迎光临================");
		System.out.println("1：查看商品清单		2：添加商品	3：删除商品	4：修改商品	5：更新商品");
		System.out.println("请输入您要操作的功能序号：");
	}
	
	/*
	 * 定义方法,实现商品数据的初始化
	 * 先将一部分数据,存储集合中
	 * 无返回值	有 参数 （集合）
	 */
	public static void init(ArrayList<FruitItem> array){
		//创建出多个FruitItem类型,并且属性赋值
		FruitItem f1 = new FruitItem();
		f1.ID = 9527;
		f1.name = "松饼";
		f1.price = 12.7;
		
		FruitItem f2 = new FruitItem();
		f2.ID = 9008;
		f2.name = "焦糖玛奇朵";
		f2.price = 5.6;
		
		FruitItem f3 = new FruitItem();
		f3.ID = 9879;
		f3.name = "艾梵圣纺织品贸易";
		f3.price = 599.6;
		
		//创建的3个FruitItem类型变量,存储到集合中
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}
	
	/*
	 * 定义方法，实现显示所有商品清单的功能
	 * 无返回值	参数（数组）
	 * 遍历集和，获取集和中的每个FruitItem变量、调用属性
	 */
	public static void showFruitList(ArrayList<FruitItem> array) {
		System.out.println();
		System.out.println("================商品库存清单================");
		System.out.println("商品编号         商品名称                商品单价");
		//遍历集和
		for(int i = 0 ;i < array.size();i++) {
			//集和get方法，获取出每个FruitItem变量
			FruitItem item = array.get(i);
			//item调用类中的属性
			System.out.println(item.ID+"       "+item.name+"              "+item.price+"        ");
		}
	}
	
	/*
	 * 定义方法，实现商品的添加
	 * 无返回值	参数（数组）
	 */
	public static void addFruitItem(ArrayList<FruitItem> array) {
		System.out.println("您选择的是商品添加功能！");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品编号：");
		//输入商品编号
		int ID = sc.nextInt();
		
		System.out.println("请输入商品名字：");
		//输入商品名字
		String name = sc.next();
		
		System.out.println("请输入商品单价：");
		//输入商品单价
		double prince = sc.nextDouble();
		
		//创建FruitItem变量
		FruitItem Item = new FruitItem();
		//item.属性赋值
		Item.ID = ID;
		Item.name = name;
		Item.price = prince;
		array.add(Item);
		System.out.println("商品添加成功！");
	}
	
	/*
	 * 定义方法，实现商品的删除
	 * 无返回值	有参数（数组）
	 * 
	 */
	
	public static void deleteFruit(ArrayList<FruitItem> array) {
		System.out.println("您选择的是商品删除功能！");
		System.out.println("请输入商品编号：");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//输入商品ID
		int ID = sc.nextInt();
		//遍历集和，用于比较该商品是否存在
		for (int i = 0; i < array.size(); i++) {
			//获取每个FruitItem变量
			FruitItem Item = array.get(i);
			//Item.属性赋值
			if(Item.ID == ID) {
				//移出符合的商品
				array.remove(i);
				System.out.println("商品删除成功！");
				return ;
			}
		}
	}
	
	/*
	 * 定义方法，实现商品的修改
	 * 无返回值	有参数（数组）
	 * 
	 */
	
	public static void updataFruit(ArrayList<FruitItem> array) {
		System.out.println("您选择的是商品修改功能！");
		System.out.println("请输入商品编号：");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//输入商品ID
		int ID = sc.nextInt();
		//遍历集和，用于比较该商品是否存在
		for (int i = 0; i < array.size(); i++) {
			//获取每个FruitItem变量
			FruitItem Item = array.get(i);
			//Item.属性赋值
			if(Item.ID == ID) {
				System.out.println("输入新的商品编号");
				Item.ID = sc.nextInt();
				
				System.out.println("输入新的商品名字");
				Item.name = sc.next();
				
				System.out.println("输入新的商品价格");
				Item.price = sc.nextDouble();
				System.out.println("商品修改成功！");
				return ;
			}
		}
	}
}

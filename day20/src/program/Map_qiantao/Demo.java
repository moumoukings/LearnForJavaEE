package program.Map_qiantao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *  Map集合的嵌套,Map中存储的还是Map集合
 *  要求:
 *    学校
 *      Java基础班
 *        001  张三
 *        002  李四
 *      
 *      Java就业班
 *        001  王五
 *        002  赵六
 *  对以上数据进行对象的存储
 *   001 张三  键值对
 *   Java基础班: 存储学号和姓名的键值对
 *   Java就业班:
 *   学校: 存储的是班级
 *   
 *   基础班Map   <学号,姓名>
 *   学校Map  <班级名字, 基础班Map>
 */
public class Demo {
	public static void main(String[] args) {
		//定义基础和就业班的集合
		HashMap<String, String> javase = new HashMap<String,String>();
		HashMap<String, String> javaee = new HashMap<String,String>();
		
		//存储数据
		javase.put("001", "张三"); 
		javase.put("002", "李四"); 
		
		javaee.put("001", "王五");
		javaee.put("002", "赵六");
		
		//定义学校集合
		HashMap<String,HashMap<String,String>> school = 
				new HashMap<String,HashMap<String,String>>();
		
		school.put("基础班", javase);
		school.put("就业班", javaee);
		//迭代集合，由外至内
		Set<String> classNameSet = school.keySet();
		Iterator<String> it = classNameSet.iterator();
		System.out.println("班级名"+"   "+"学号"+"        "+"姓名");
		while(it.hasNext()) {
			String className = it.next();
			//内部
			HashMap<String, String> classGet = school.get(className);
			Set<String> studentNumSet = classGet.keySet();
			Iterator<String> it2 = studentNumSet.iterator();
			while(it2.hasNext()) {
				String studentNum = it2.next();
				String studentName = classGet.get(studentNum);
				System.out.println(className+"   "+studentNum+"   "+studentName);
			}
		}
		System.out.println("======================");
		//增强for循环
		for (Map.Entry<String, HashMap<String, String>> str : school.entrySet()) {
			String className = str.getKey();
			HashMap<String, String> student = str.getValue();
			for (Map.Entry<String, String> str1 : student.entrySet()) {
				String studentNum =str1.getKey();
				String studentName = str1.getValue();
				System.out.println(className+"   "+studentNum+"   "+studentName);
			}
		}	
	}
}

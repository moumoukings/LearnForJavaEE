package exercise.homework_7;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws Exception {
		//IO流读取配置文件
		FileReader r = new FileReader("config.properties");
		//创建Properties集合
		Properties pro = new Properties();
		pro.load(r);
		r.close();
		//获取键值
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		//反射获取指定类的class文件对象
		Class c = Class.forName(className);
		Object obj = c.newInstance();
		//获取指定的方法名
		Method method = c.getMethod(methodName);
		method.invoke(obj);
	}
}

package exercise.homework_3;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("exercise.homework_3.Work");
		//利用反射创建Work类对象
		Work w = (Work) c.newInstance();
		//利用反射获取Work中print方法
		Method method = c.getMethod("print", String.class);
		method.invoke(w, "滚吧");
	}
}

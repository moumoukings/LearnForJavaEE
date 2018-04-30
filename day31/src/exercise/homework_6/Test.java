package exercise.homework_6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception {
		//1.获取Person类的字节码对象
		Class c = Person.class;
		//2.调用构造函数初始化name、age
		Constructor constructor = c.getConstructor(String.class,int.class);
		//3.调用构造方法,并赋值
		Person p = (Person)constructor.newInstance("谁打",31);
		System.out.println(p);
		//4.使用反射方式调用setName方法对名称进行设置
		Method method = c.getMethod("setName", String.class);
		method.invoke(p, "还打");
		//5.不使用setAge方法直接使用反射方式对age赋值。
		Field age = c.getDeclaredField("age");
		age.setAccessible(true);
		age.set(p, 13);
		System.out.println(p);
	}
}

package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) throws Exception{
		Class clss = Class.forName("singleton.Student");
		Constructor[] constructor = clss.getDeclaredConstructors();
		constructor[0].setAccessible(true);
		Student st = (Student)constructor[0].newInstance();
	}
}

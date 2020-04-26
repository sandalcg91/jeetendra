import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Y1
{
	void test()
	{
		System.out.println("test");
	}
}
class Y
{
	public static void main(String[] args) throws InstantiationException,IllegalAccessException,SecurityException,NoSuchMethodException,
													IllegalArgumentException, InvocationTargetException, ClassNotFoundException
	{
		Y1 y = new Y1();
		Class c1 = y.getClass();
		Object o = c1.newInstance();
		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(o);
		System.out.println("----------");
		Class c2 = new Y1().getClass();
		Object o1 = c2.newInstance();
		Y1 y1 = (Y1)o1;
		y1.test();
	
		System.out.println("----------");
		Class c3 = Class.forName("objectClass.Y1");
		Y1 y2 =(Y1)c3.newInstance();
		y2.test();
	//	System.out.println("----------");
	//	System.out.println(o==o1); // true
	//	System.out.println("-------------");
		System.out.println("done");
	}
}
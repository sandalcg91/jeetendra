import java.lang.reflect.Method;
import java.util.Scanner;
class Person
{
	void address()
	{
		System.out.println("address");
	}
	void Email()
	{
		System.out.println("email");
	}
	void FirstName()
	{
		System.out.println("FirstName");
	}
}
class Emp
{
	void Empid()
	{
		System.out.println("Employee ID");
	}
}
class Z
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter class name");
		String className = sc.next();
		Class c1 = Class.forName(className);
		Object o = c1.newInstance();
		System.out.println("enter method name");
		String methodName = sc.next();
		Method m1 = c1.getDeclaredMethod(methodName);
		m1.invoke(o);
		System.out.println("done");
	}
}
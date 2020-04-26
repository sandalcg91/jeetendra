import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class GetClass
{
	public static void main(String[] args)
	{
		int count =0;
		Object o = new GetClass(); // new String("Chandan");
		Class c = o.getClass();
		
		System.out.println("Fully qualified name of class : "+c.getClass());
		
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total no of methods are : "+count);
		count = 0;
		Constructor[] ct = c.getDeclaredConstructors();
		for(Constructor ct1 : ct)
		{
			count++;
			System.out.println(ct1.getName());
		}
		System.out.println("Total no of Constructors are : "+count);
	}
}
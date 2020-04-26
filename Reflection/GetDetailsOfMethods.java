import java.lang.reflect.*;
class GetDetailsOfMethods
{
	public static void main(String[] args) throws Exception
	{
		Class c = Employee2.class;
		Method[] mtd = c.getDeclaredMethods();
		for(Method m : mtd)
		{
			System.out.println("Name : "+m.getName());
			System.out.println("Return Types = : "+m.getReturnType().getName());
			int i = m.getModifiers();
			System.out.println("Access Modifiers : "+Modifier.toString(i));
			Class[] cl = m.getParameterTypes();
			System.out.println("PArameter types : ");
			for(Class cls : cl)
			{
				System.out.println(cls.getName() + " ");
			}
			Class[] cl1 = m.getExceptionTypes();
			System.out.println("Exception types : ");
			for(Class cls1 : cl1)
			{
				System.out.println(cls1.getName() + " ");
			}
		}
	}
}
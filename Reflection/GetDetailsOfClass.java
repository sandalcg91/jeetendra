import java.lang.reflect.*;
class GetDetailsOfClass
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("Employee");
		System.out.println("Name : "+c.getName());
		System.out.println("Super class Name : "+c.getSuperclass());
		Class[] cl = c.getInterfaces();
		System.out.println("Interfaces List : ");
		for(Class cls : cl)
		{
			System.out.println(cls.getName());
		}
		System.out.println("");
		int i = c.getModifiers();
		System.out.println("Access MOdifires : "+Modifier.toString(i));
	}
}
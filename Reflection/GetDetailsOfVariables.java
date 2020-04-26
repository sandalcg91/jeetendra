import java.lang.reflect.*;
class GetDetailsOfVariables
{
	public static void main(String[] args) throws Exception
	{
		Employee1 e = new Employee1();
		Class c = e.getClass();
		Field[] f = c.getDeclaredFields();
	//	System.out.println("Interfaces List : ");
		for(Field fld : f)
		{
			System.out.println("Name :" +fld.getName());
			System.out.println("Data Type : "+fld.getType().getName());
			int i = fld.getModifiers();
			System.out.println("Access Modifier : " +Modifier.toString(i));
			System.out.println("Value " +fld.get(fld));
		}
	}
}
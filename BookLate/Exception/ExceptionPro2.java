public class ExceptionPro2
{
	static void test() throws ClassNotFoundException
	{
		Class.forName("A.class");
	}
	
	public static void main(String[] args)
	{
		try
		{
			test();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(VirtualMachineError e)
		{
			
		}
	}
}
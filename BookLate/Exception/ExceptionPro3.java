public class ExceptionPro3
{
	int test(int i)
	{
		try
		{
			i=10/i;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		return i;
	}
	
	public static void main(String[] args)
	{
		ExceptionPro3 ep = new ExceptionPro3();
		System.out.println(ep.test(0));
	}
}
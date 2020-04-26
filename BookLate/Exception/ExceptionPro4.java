public class ExceptionPro4
{
	int test(int i)
	{
		try
		{
			i=10/i;
			return i;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		return i;
	}
	
	public static void main(String[] args)
	{
		ExceptionPro4 ep = new ExceptionPro4();
		System.out.println(ep.test(10));
	}
}
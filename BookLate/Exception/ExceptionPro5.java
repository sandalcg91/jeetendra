public class ExceptionPro5
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
			return i;
		}
		//return i;
	}
	
	public static void main(String[] args)
	{
		ExceptionPro5 ep = new ExceptionPro5();
		System.out.println(ep.test(10));
	}
}
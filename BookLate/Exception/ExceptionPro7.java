public class ExceptionPro7
{
	static void test()
	{
		try
		{
			i=10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			try
			{
				int i = Integer.ParseInt("abc");
			}
			catch(NumberFormatException nfe)
			{
				System.out.println(nfe);
			}
			finally
			{
				System.out.println("Inner- finally");
			}
		}
		finally
		{
			System.out.println("Inner- finally");
		}
	}
	
	public static void main(String[] args)
	{
		test();
	}
}
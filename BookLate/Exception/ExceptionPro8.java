public class ExceptionPro8
{
	static int i;
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
				int i = Integer.parseInt("abc");
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
			System.out.println("outer-finally");
		}
	}

	public static void main(String[] args)
	{
		test();
	}
}
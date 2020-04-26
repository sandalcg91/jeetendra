public class ExceptionPro1
{
	int i = 90;
	
	public static void main(String[] args)
	{
		System.out.println(i);  // non-static var i can't be referenced from a static context
		
		try
		{
			ExceptionPro1 ep = new ExceptionPro1();
			System.out.println(ep.i);
		}
		catch(Exception e)
		{
			ExceptionPro1 ep = new ExceptionPro1();
		}
	}
}
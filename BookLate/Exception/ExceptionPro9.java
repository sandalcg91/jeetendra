public class ExceptionPro9
{
	public static void main(String[] args)
	{
		System.out.println("1");
		try
		{
			int i = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
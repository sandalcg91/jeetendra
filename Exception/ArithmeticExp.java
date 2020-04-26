class ArithmeticExp
{
	public static void main(String[] args)
	{
		System.out.println("Chandan Gupta");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
			//System.out.println("Getting Arithmetic Exception " +ae);
		}
		System.out.println("java Fundamental");
		System.out.println("sandal");
	}
}
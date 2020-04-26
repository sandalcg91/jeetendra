class ThrowsExp1
{
	void m() //throws ArithmeticException
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
	public static void main(String[] args)
	{
		ThrowsExp1 te = new ThrowsExp1();
		te.m();
	}
}
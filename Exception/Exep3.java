class Exep3
{
	public static void main(String[] args)
	{
		System.out.println("Chandan Gupta");
		try
		{
			System.out.println(10/0);
		}
		//System.out.println("java Fundamental");
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			// close connection, close files
			System.out.println("Finally BLock Executed");
		}
		System.out.println("sandal");
	}
}
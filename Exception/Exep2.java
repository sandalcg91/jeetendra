class Exep2
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
		//	System.out.println("10 cant divide by 0");
		//	System.out.println(e.toString());
		//	e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("sandal");
	}
}
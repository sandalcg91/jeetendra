class NullPointerExp
{
	public static void main(String[] args)
	{
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException npe)
		{
			System.out.println("Getting Exception " +npe);
		}
	}
}
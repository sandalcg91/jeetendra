class NumberFormatExp
{
	public static void main(String[] args)
	{
		try
		{
			int i = Integer.parseInt(args[0]);
			System.out.println("Entered Number is " +i);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Getting Exception " +nfe);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Getting Exception " +aie);
		}
	}
}
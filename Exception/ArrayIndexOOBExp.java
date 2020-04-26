class ArrayIndexOOBExp
{
	public static void main(String[] args)
	{
		try
		{
			int[] ar = new int[3];
			System.out.println(ar[0]);
			System.out.println(ar[1]);
			System.out.println(ar[2]);
			System.out.println(ar[3]);
		}
		catch(ArrayIndexOutOfBoundsException be)
		{
			System.out.println("Getting Exception " +be);
		}
	}
}
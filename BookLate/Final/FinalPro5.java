class FinalPro5
{
	final int i = 20;
	
	static void test(final int j)
	{
		// j++;
		System.out.println(j);
	}
	
	public static void main(String[] args)
	{
		final int i = 90;
		test(i);
		System.out.println("Hello");
		System.out.println(i);
	}
}
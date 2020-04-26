class FinalPro1
{
	static void test(int k)
	{
		System.out.println(k);
	}
	public static void main(String[] args)
	{
		final int i = 20;
		int j = 10;
		
		test(i);  // 20
		
		//i = 10;  // can't reinitialized
		
		test(j);  // 10
	}
}
class FinalPro15
{
	static final int i = 90;
	static int j;
	
	void test()
	{
		//i = 90;  cant't assign a value to final variable i
	}
	FinalPro15()
	{
		// i = 90;
	}
	FinalPro15(int k)
	{
		// i = 90;
	}
	FinalPro15(int k, int j)
	{
		// i = 90;
	}
	
	public static void main(String[] args)
	{
		FinalPro15 fp = new FinalPro15();
	}
}
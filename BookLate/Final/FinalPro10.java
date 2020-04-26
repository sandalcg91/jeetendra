class FinalPro10
{
	final int i;
	
	FinalPro10()
	{
		i = 90;
	}
	FinalPro10(final int i)
	{
		this.i = i;
	}
	
	public static void main(String[] args)
	{
		final int i = 60;
		
		FinalPro10 fp = new FinalPro10();
		FinalPro10 fp1 = new FinalPro10();

		FinalPro10 fp2 = new FinalPro10(12);
		FinalPro10 fp3 = new FinalPro10(15);
		
		System.out.println(fp.i);  // 90
		System.out.println(fp1.i);  // 90
		System.out.println(fp2.i);  // 12 final cant't be change
	}
}
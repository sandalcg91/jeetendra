class FinalPro7
{
	final int i;
	int j=20;
	
	FinalPro7()
	{
		i = 90;
		System.out.println(this.j);
	}
	FinalPro7(int i)
	{
		this();
		i = 80;
	//	System.out.println(this.j);
	}
	FinalPro7(int i, int j)
	{
		this(1);
		i = 70;
		j = 90;
	//	System.out.println(this.j);
	}
	
	public static void main(String[] args)
	{
		FinalPro7 fp1 = new FinalPro7();
		FinalPro7 fp2 = new FinalPro7(12);
		FinalPro7 fp3 = new FinalPro7(14, 13);
		
		//fp1.j = 20; can't assign final var
		
		//fp1.i = 30;
		System.out.println("done");
	}
}
class StaticPro7
{
	int i,j;
	
	StaticPro7()
	{
		System.out.println("StaticPro7()");
	}
	StaticPro7(int i)
	{
		this.i = i;
		System.out.println("StaticPro7(int)");
	}
	StaticPro7(int i, int j)
	{
		this.i = i;
		this.j = j;
		System.out.println("StaticPro7(int,int)");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	{
		System.out.println("IIB3");
	}
	public static void main(String[] args)
	{
		StaticPro7 sp = new StaticPro7();
		System.out.println("----------");
		StaticPro7 sp1 = new StaticPro7(12);
		System.out.println("----------");
		StaticPro7 sp2 = new StaticPro7(12,13);
	}
}
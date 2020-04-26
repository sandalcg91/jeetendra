class SIB3
{
	{
		System.out.println("Hello1");
	}
	static
	{
		System.out.println("SIB");
	}
	SIB3()
	{
		System.out.println("Hello2");
	}
	SIB3(int i)
	{
		System.out.println("Hello3");
	}
	SIB3(int i, int j)
	{
		System.out.println("Hello4");
	}
	public static void main(String[] args)
	{
		SIB3 s = new SIB3();
		SIB3 s1 = new SIB3(12);
		SIB3 s2 = new SIB3(12,12);
		System.out.println("main");
	}
}
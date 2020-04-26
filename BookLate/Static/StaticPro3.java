class StaticPro3
{
	int i = 10;
	StaticPro3()
	{
		System.out.println("zero args constructor");
	}
	StaticPro3(int i)
	{
		this.i = i;
	}
	void test1(StaticPro3 sp1)
	{
		System.out.println(sp1.i);
	}
	void test()
	{
		StaticPro3 sp2 = new StaticPro3();
		test1(sp2);
		test1(this);
		System.out.println(this.i);
	}
	public static void main(String[] args)
	{
		StaticPro3 sp = new StaticPro3(30);
		sp.test();
	}
}
class M1
{
	M1()
	{
		System.out.println(1);
	}
	M1(int i)
	{
		this();
		System.out.println(2);
	}
	void test()
	{
		//this();
		System.out.println(3);
	}
}
class M
{
	public static void main(String[] args)
	{
		M1 m = new M1();
		System.out.println("---------------");
		M1 m1 = new M1(12);
		System.out.println("---------------");
		m1.test();
	}
}
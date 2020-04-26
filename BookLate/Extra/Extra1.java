class C1
{
	void test()
	{
		System.out.println("test");
	}
}
class C extends C1
{
	void test()
	{
		System.out.println("C_test");
	}
	void test1()
	{
		System.out.println("test1");
	}
	
	public static void main(String[] args)
	{
		C c1 = new C();
		C1 c2 = new C1();
	}
}
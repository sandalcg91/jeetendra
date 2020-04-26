interface B2
{
	void test();
	final double pi = 20;
}
class B1 implements B2
{
	public void test()
	{
		System.out.println("test");
	}
	void test2()
	{
		System.out.println("test2");
	}
	
	public static void main(String[] args)
	{
		B2 b = new B1();
		b.test();
		
	//	B1 b1 = new B1();
	//	b1.test2();
	}
}
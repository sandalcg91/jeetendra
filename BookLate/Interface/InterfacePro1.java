interface A1
{
	void test();
}
class A implements A1
{
	public void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args)
	{
		A a = new A();
		a.test();
	}
}
class B implements A1
{
	public void test()
	{
		System.out.println("B-test");
	}
	public static void main(String[] args)
	{
		B b = new B();
		b.test();
	}
}
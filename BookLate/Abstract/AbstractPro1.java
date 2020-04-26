abstract class A1
{
	A1()
	{
		System.out.println("A1()");
	}
	abstract void test();
}
class A extends A1
{
	A()
	{
		//super();
		System.out.println("A()");
	}
	void test()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		//A1 a;
		A a = new A();
		System.out.println("-----");
		a.test();
	}
}
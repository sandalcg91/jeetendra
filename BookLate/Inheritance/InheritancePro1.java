class B
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
}
class A extends B
{
	A()
	{
		super();
		System.out.println("123");
	}
	public static void main(String[] args)
	{
		B b = new B(11);
		A a = new A();
	}
}
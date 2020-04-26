class B1
{
	static
	{
		System.out.println("SIB1");
	}
	B1()
	{
		System.out.println("B1()");
	}
}
class B2 extends B1
{
	static
	{
		System.out.println("SIB2");
	}
	B2()
	{
		super();
		System.out.println("B2()");
	}
}
class B3 extends B2
{
	static
	{
		System.out.println("SIB3");
	}
	B3()
	{
		super();
		System.out.println("B3()");
	}
}
class B
{
	public static void main(String[] args)
	{
		B1 b1 = new B1();
		System.out.println("-----------");
		
		B2 b2 = new B2();
		System.out.println("-----------");
		
		B3 b3 = new B3();
	}
}
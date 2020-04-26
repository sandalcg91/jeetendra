class C1
{
	{
		System.out.println("IIB1");
	}
	C1()
	{
		System.out.println("C1()");
	}
}
class C2 extends C1
{
	{
		System.out.println("IIB2");
	}
	C2()
	{
		super();
		System.out.println("C2()");
	}
}
class C3 extends C2
{
	{
		System.out.println("IIB3");
	}
	C3()
	{
		super();
		System.out.println("C3()");
	}
}
class C
{
	public static void main(String[] args)
	{
		new C1();
		System.out.println("-----------");
		
		new C2();
		System.out.println("-----------");
		
		new C3();
	}
}
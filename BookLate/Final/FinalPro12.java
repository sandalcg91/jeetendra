class L
{
	final void test()
	{
		System.out.println("test-L");
	}
}
class L1 extends L
{
	/*final void test()     //   final method can't override
	{
		System.out.println("test-L1");
	}*/
	
	public static void main(String[] args)
	{
		L1 l = new L1();
		l.test();
		System.out.println("hello");
	}
}
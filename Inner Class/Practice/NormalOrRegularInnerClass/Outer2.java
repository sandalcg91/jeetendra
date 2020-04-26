class Outer2
{
	int x = 10;
	static int y = 20;
	public static void m1()
	{
		class Inner2
		{
			public void m2()
			{
		//		System.out.println(x);		// non-static var cant invoke inside static method
				System.out.println(y);		
			}
		}
		Inner2 i = new Inner2();
		i.m2();
	}
	public static void main(String[] args)
	{
		m1();
	}
}
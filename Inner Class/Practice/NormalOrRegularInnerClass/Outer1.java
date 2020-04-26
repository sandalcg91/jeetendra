class Outer1
{
	public void m1()
	{
		class Inner1
		{
			public void sum(int a, int b)
			{
				System.out.println(a+b);
			}
		}
		Inner1 i = new Inner1();
		i.sum(10,20);
	}
	public static void main(String[] args)
	{
		new Outer1().m1();
	}
}
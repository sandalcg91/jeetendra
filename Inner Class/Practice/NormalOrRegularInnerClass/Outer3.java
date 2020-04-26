class Outer3
{
	int x = 10;
	
	public void m1()
	{
		int y = 20;
		class Inner3
		{
			public void m2()
			{
				System.out.println(y);		
			}
		}
		Inner3 i = new Inner3();
		i.m2();
	}
	public static void main(String[] args)
	{
		new Outer3().m1();
	}
}
// we can't access local variablesof method of outer class from 1.1v to 1.7v 
// we can access default and final local variables
class Outer14
{
	int x = 10;
	
	public void m()
	{
		final int y = 20;
		
		class Inner14
		{
			public void m1()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner14 i = new Inner14();
		i.m1();
	}
	public static void main(String[] args)
	{
		new Outer14().m();
	}
}
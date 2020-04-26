// we can declare Inner class only in static method
// then we can access only static variables of outer class directly
class Outer13
{
	int x = 10;
	static int y = 20;

	public static void m()
	{
		class Inner13
		{
			public void m1()
			{
			//	System.out.println(x);
				System.out.println(y);
			}
		}
		Inner13 i = new Inner13();
		i.m1();
	}
	public static void main(String[] args)
	{
		new Outer13().m();
	}
}
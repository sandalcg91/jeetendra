// we can declare Inner class either in instance method or in static method
// we can access both static and non-static variables of outer class directly
class Outer12
{
	int x = 10;
	static int y = 20;

	public void m()
	{
		class Inner12
		{
			public void m1()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner12 i = new Inner12();
		i.m1();
	}
	public static void main(String[] args)
	{
		new Outer12().m();
	}
}
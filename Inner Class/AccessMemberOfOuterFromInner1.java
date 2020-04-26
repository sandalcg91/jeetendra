// From the inner class we can access all the members of outer class(Both static and non-static) directly

class Outer5
{
	static int x = 10;
	int y = 30;
	
	class Inner5
	{
		public void m()
		{
			System.out.println("Inner class method");
			System.out.println(x+"  "+y);
			m1();
			m2();
		}
	}
	void m1()
	{
		System.out.println("Outer class Instance method");
	}
	static void m2()
	{
		System.out.println("Outer class static method");
	}
}
class Outer5Test
{
	public static void main(String[] args)
	{
		new Outer5().new Inner5().m();
	}
}
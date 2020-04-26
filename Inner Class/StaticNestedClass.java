class Outer111
{
	static class Nested
	{
		public void m1()
		{
			System.out.println("static nested class method");
		}
	}
	
	public static void main(String[] args)
	{
		Nested n = new Nested();
		n.m1();
	}
}
class StaticNestedClass
{
	public static void main(String[] args)
	{
		Outer111.Nested n = new Outer111.Nested();
		n.m1();
	}
}
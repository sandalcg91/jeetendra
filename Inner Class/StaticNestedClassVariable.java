class StaticNestedClassVariable
{
	int x = 10;
	static int y = 20;
	
	static class Nested2
	{
		public void m1()
		{
		//	System.out.println(x);  //  non-static variable x cannot be referenced from a static context
			System.out.println(y);
		}
	}
	public static void main(String[] args)
	{
		Nested2 n = new Nested2();
		n.m1();
	}
}
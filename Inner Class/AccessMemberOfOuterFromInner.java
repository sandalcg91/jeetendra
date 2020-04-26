// From the inner class we can access all the members of outer class(Both static and non-static) directly

class Outer3
{
	static int x = 10;
	int y = 30;
	
	class Inner3
	{
		public void m()
		{
			System.out.println("Inner class method");
			System.out.println(x);
			System.out.println(y);
			System.out.println(x+"  "+y);
		}
	}

	public static void main(String[] args)
	{
		new Outer3().new Inner3().m();
	}
}
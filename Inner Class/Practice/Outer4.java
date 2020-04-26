class Outer4
{
	int x = 19;

	class Inner4
	{
		int x = 29;
		public void m1()
		{
			int x = 39;
			
			System.out.println(x);
			System.out.println(this.x); // System.out.println(Inner.this.x);
			System.out.println(Outer4.this.x);
		}
	}
	public static void main(String[] args)
	{
		new Outer4().new Inner4().m1();
	}
}
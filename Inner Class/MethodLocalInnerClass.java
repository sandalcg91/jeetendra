class Outer11
{
	public void m()
	{
		class Inner11
		{
			public void sum(int x, int y)
			{
				System.out.println("sum is : " + (x+y));
			}
		}
		Inner11 i = new Inner11();
		i.sum(10, 20);
		i.sum(110, 220);
		i.sum(1110, 2220);
		i.sum(11110, 22220);
	}
	public static void main(String[] args)
	{
		new Outer11().m();
	}
}